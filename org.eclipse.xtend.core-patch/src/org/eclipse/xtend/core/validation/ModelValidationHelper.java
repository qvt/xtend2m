package org.eclipse.xtend.core.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import edu.kit.ipd.sdq.xtend2m.annotations.ModelIn;
import edu.kit.ipd.sdq.xtend2m.annotations.ModelOut;
import edu.kit.ipd.sdq.xtend2m.annotations.Strict;
import edu.kit.ipd.sdq.xtend2m.annotations.Transformation;
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface;
import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker;

public class ModelValidationHelper {
	private final String FQN_TRANSFORMATION_INTERFACE = TransformationInterface.class.getName();
	private final String FQN_TRANSFORMATION = Transformation.class.getName();
	private final String FQN_MODEL_IN = ModelIn.class.getName();
	private final String FQN_MODEL_OUT = ModelOut.class.getName();
	private final String FQN_STRICT_MODE = Strict.class.getName();
	private final String FQN_EOBJECT = EObject.class.getName();

	public List<String> errorMessages = new ArrayList<String>();
	public List<EObject> errorObjects  = new ArrayList<EObject>();
	public boolean strict = false;

	private boolean debug = false;
	
	// XExpressions that have already been visited
	private static Set<XExpression> checkedExpressions = new HashSet<XExpression>();
	
	// for travelling up in the hierarchy
	private IXtendJvmAssociations associations;

	public ModelValidationHelper(IXtendJvmAssociations associations) {
		this.associations = associations;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public List<EObject> getErrorObjects() {
		return errorObjects;
	}

	public void initialize() {
		errorMessages = new ArrayList<String>();
		errorObjects  = new ArrayList<EObject>();
		strict = false;
	}

	private void error(String errorMessage, EObject object) {
		System.out.println("ERROR: \n-- " + errorMessage + "\n ON " + object);
		errorMessages.add(errorMessage);
		errorObjects.add(object);
	}

	public void checkClassModelInterfaceAdherance(XtendClass clazz) {
		checkClassModelInterfaceAdherance(clazz, null, null, null);
	}
	
	public void checkClassModelInterfaceAdherance(XtendClass clazz,
			List<String> inputAllowedArgument, List<String> outputAllowedArgument,
			EObject parentClass) {
		checkedExpressions.clear();

		EList<JvmTypeReference> interfaces = clazz.getImplements();

		boolean checkClazz = false;
		for (XAnnotation clazzAnnotation : clazz.getAnnotationInfo().getAnnotations())
			if (clazzAnnotation.getAnnotationType().getIdentifier().equals(FQN_TRANSFORMATION)) {
				checkClazz = true;
				break;
			}
		
		if (checkClazz || (parentClass != null)) {
			// add to the allowed input for parent instances
			List<String> inputAllowed =
				(inputAllowedArgument == null)
					? new ArrayList<String>()
						: new ArrayList<String>(inputAllowedArgument);
			List<String> outputAllowed =
				(outputAllowedArgument == null)
					? new ArrayList<String>()
					: new ArrayList<String>(outputAllowedArgument);

			for (JvmTypeReference iface : interfaces) {
				JvmType typ = iface.getType();
				traverseModelInOut(inputAllowed, outputAllowed, typ);
			}
	
			inputAllowed.addAll(outputAllowed);
	
			for (XtendMember member : clazz.getMembers()) {
				if (member instanceof XtendFunction) {
					XtendFunction f = (XtendFunction) member;

					if (f.getExpression() != null)
						for (EObject content : f.getExpression().eContents()) {
							if (content instanceof XExpression)
								checkSubFunction((XExpression) content, inputAllowed, parentClass);
						}
				}
			}
			
			// additionally, check all methods in super types
			// this is restricted to methods defined in Xtend classes
			JvmTypeReference superType = clazz.getExtends();
			if ((superType != null) && (superType.getType() instanceof JvmGenericType)) {
				XtendClass extendedXtendClass = associations.getXtendClass((JvmGenericType) superType.getType());
				checkClassModelInterfaceAdherance(extendedXtendClass, inputAllowed, outputAllowed, clazz.getExtends());
			}
		}
	}

	private void traverseModelInOut(List<String> inputAllowed,
			List<String> outputAllowed, JvmType typ) {
		EObjectContainmentEList<JvmAnnotationReference> annotations =
				(EObjectContainmentEList<JvmAnnotationReference>) typ.eGet(typ.eClass().getEStructuralFeature("annotations"));

		for (JvmAnnotationReference ann : annotations) {
			String qualifiedName = ann.getAnnotation().getQualifiedName();
			if (qualifiedName.equals(FQN_STRICT_MODE)) {
				strict = true;
			}
			else if (qualifiedName.equals(FQN_MODEL_IN)) {
				for (JvmAnnotationValue val : ann.getValues()) {
					if (val instanceof JvmCustomAnnotationValue) {
						// We traverse the unparsed array directly, not as an array
						for (Object value : ((JvmCustomAnnotationValue) val).getValues()) {
							if (value instanceof XListLiteral) {
								for (XExpression xexpr : ((XListLiteral) value).getElements()) {
									if (xexpr instanceof XStringLiteral) {
										String sValue = ((XStringLiteral) xexpr).getValue();
										System.out.println("Adding input value: " + sValue);
										inputAllowed.add(sValue);
									}
								}
							}
						}
					}
				}
			}
			else if (qualifiedName.equals(FQN_MODEL_OUT)) {
				for (JvmAnnotationValue val : ann.getValues()) {
					if (val instanceof JvmCustomAnnotationValue) {
						// We traverse the unparsed array directly, not as an array
						for (Object value : ((JvmCustomAnnotationValue) val).getValues()) {
							if (value instanceof XListLiteral) {
								for (XExpression xexpr : ((XListLiteral) value).getElements()) {
									if (xexpr instanceof XStringLiteral) {
										String sValue = ((XStringLiteral) xexpr).getValue();
										System.out.println("Adding ouput value: " + sValue);
										outputAllowed.add(sValue);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void checkSubFunctions(Collection<EObject> objs, List<String> inputAllowed, EObject errorAnnotationTarget) {
		for (EObject obj : objs)
			if (obj instanceof XExpression)
				checkSubFunction((XExpression) obj, inputAllowed, errorAnnotationTarget);
	}

	private void checkSubFunctionsX(Collection<XExpression> objs, List<String> inputAllowed, EObject errorAnnotationTarget) {
		for (XExpression obj : objs)
			checkSubFunction(obj, inputAllowed, errorAnnotationTarget);
	}

	private void checkSubFunction(XExpression exp, List<String> inputAllowed, EObject errorAnnotationTarget) {
		if (exp == null)
			return;
		
		if (checkedExpressions.contains(exp))
			return;

		checkedExpressions.add(exp);

		for (EStructuralFeature f : exp.eClass().getEAllStructuralFeatures()) {
			try {
				Object feat = exp.eGet(f);
				if (feat instanceof XExpression)
					checkSubFunction((XExpression) feat, inputAllowed, errorAnnotationTarget);
				if (feat instanceof JvmMember) {
					JvmMember member = (JvmMember) feat;
					if (illegalType(member.getDeclaringType(), inputAllowed)) {
						error("Illegal model access to "
								+ member.getDeclaringType().getQualifiedName(),
								(errorAnnotationTarget == null ? exp : errorAnnotationTarget));
					}
				}
				if (feat instanceof JvmOperation) {
					JvmOperation op = (JvmOperation) feat;
					if (illegalType(op.getReturnType().getType(), inputAllowed)) {
						error("Illegal model access to "
								+ op.getReturnType().getQualifiedName(),
								(errorAnnotationTarget == null ? exp : errorAnnotationTarget));
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (exp instanceof XAbstractFeatureCall) {
			XAbstractFeatureCall concreteExp = (XAbstractFeatureCall) exp;
			for (XExpression x : concreteExp.getActualArguments())
				checkSubFunction(x, inputAllowed, errorAnnotationTarget);
			checkSubFunction(concreteExp.getActualReceiver(), inputAllowed, errorAnnotationTarget);
		} else if (exp instanceof XAbstractWhileExpression) {
			XAbstractWhileExpression concreteExp = (XAbstractWhileExpression) exp;
			checkSubFunction(concreteExp.getPredicate(), inputAllowed, errorAnnotationTarget);
			checkSubFunction(concreteExp.getBody(), inputAllowed, errorAnnotationTarget);
		} else if (exp instanceof XBlockExpression) {
			XBlockExpression concreteExp = (XBlockExpression) exp;
			checkSubFunctionsX(concreteExp.getExpressions(), inputAllowed, errorAnnotationTarget);
		} else if (exp instanceof XCastedExpression) {
			XCastedExpression concreteExp = (XCastedExpression) exp;
//			checkType(concreteExp.getType());
			checkSubFunction(concreteExp.getTarget(), inputAllowed, errorAnnotationTarget);
		} else if (exp instanceof XClosure) {
			XClosure concreteExp = (XClosure) exp;
			checkSubFunction(concreteExp.getExpression(), inputAllowed, errorAnnotationTarget);
		}

		checkSubFunctions(exp.eContents(), inputAllowed, errorAnnotationTarget);
	}

	private boolean illegalType(JvmType type, List<String> inputAllowed) {
		if (type == null)
			return false;

		String fqn = type.getQualifiedName();
		if (fqn.startsWith("cm") || fqn.startsWith("cg"))
			debug = true;

		if (debug)
			System.out.println("Checking Type: " + type + ", allowed: " + inputAllowed);

		if (!isEObjectSubclass(type)) {
			debug = false;
			return false;
		}

		if (debug)
			System.out.println("Found EObject Subclass: " + type);

		boolean result = !new StarImportChecker().check(type.getQualifiedName(), inputAllowed.toArray(new String[0]));
		System.out.println("Check-Result: " + result);
		debug = false;
		return result;
	}


	private boolean isEObjectSubclass(JvmType type) {
		return isEObjectSubclass(type, type);
	}


	private boolean isEObjectSubclass(JvmType type, JvmType parent) {
		if (debug)
			System.out.println("[parent: " + parent.getQualifiedName() + "] Checking for EObj: " + type);
		if (type == null)
			return false;

		if (type instanceof JvmGenericType) {
			JvmGenericType jvmType = (JvmGenericType) type;

			for (JvmTypeReference ifaceRef : jvmType.getExtendedInterfaces()) {
				JvmType iface = ifaceRef.getType();
				if (debug)
					System.out.println("[parent: " + parent.getQualifiedName() + "] [" + type.getQualifiedName() + "] Checking: " + iface.getQualifiedName());
				if (iface.getQualifiedName().equals(FQN_EOBJECT))
					return true;
				else if (isEObjectSubclass(iface))
					return true;
			}

			if (jvmType.getExtendedClass() == null)
				return false;

			return isEObjectSubclass(((JvmGenericType) type).getExtendedClass().getType());
		}

		return false;
	}

}
