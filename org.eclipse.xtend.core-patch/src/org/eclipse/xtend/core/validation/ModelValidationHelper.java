package org.eclipse.xtend.core.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker;

public class ModelValidationHelper {
	private final String FQN_TRANSFORMATION_INTERFACE = "edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface";
	private final String FQN_MODEL_IN = "edu.kit.ipd.sdq.xtend2m.annotations.ModelIn";
	private final String FQN_MODEL_OUT = "edu.kit.ipd.sdq.xtend2m.annotations.ModelOut";
	private final String FQN_STRICT_MODE = "edu.kit.ipd.sdq.xtend2m.annotations.Strict";
	private final String FQN_EOBJECT = "org.eclipse.emf.ecore.EObject";
	
	public List<String> errorMessages = new ArrayList<String>();
	public List<EObject> errorObjects  = new ArrayList<EObject>();
	public boolean strict = false;
	
	private boolean debug = false;
	
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
		checked.clear();
		
		ArrayList<String> inputAllowed = new ArrayList<String>();
		ArrayList<String> outputAllowed = new ArrayList<String>();
		
		EList<JvmTypeReference> interfaces = clazz.getImplements();
		boolean checkClass = false;
		for (JvmTypeReference iface : interfaces) {
//			System.out.println("Interface:\n  " + iface + "\n\n");
			JvmType typ = iface.getType();
//			System.out.println("Type:\n  " + typ.getQualifiedName());
			EObjectContainmentEList<JvmAnnotationReference> annotations =
					(EObjectContainmentEList<JvmAnnotationReference>) typ.eGet(typ.eClass().getEStructuralFeature("annotations"));

//			System.out.println("annotations:");
			for (JvmAnnotationReference ann : annotations) {
				String qualifiedName = ann.getAnnotation().getQualifiedName();
				if (qualifiedName.equals(FQN_TRANSFORMATION_INTERFACE)) {
					checkClass = true;
				}
				else if (qualifiedName.equals(FQN_STRICT_MODE)) {
					strict = true;
				}
				else if (qualifiedName.equals(FQN_MODEL_IN)) {
					for (JvmAnnotationValue val : ann.getValues()) {
//						System.out.println("== " + val);
						if (val instanceof JvmCustomAnnotationValue)
							for (Object value : ((JvmCustomAnnotationValue) val).getValues()) {
								if (value instanceof XStringLiteral) {
									String sValue = ((XStringLiteral) value).getValue();
									System.out.println("Adding input value: " + sValue);
									inputAllowed.add(sValue);
								}
							}
					}
				}
				else if (qualifiedName.equals(FQN_MODEL_OUT)) {
					for (JvmAnnotationValue val : ann.getValues()) {
//						System.out.println("== " + val);
						if (val instanceof JvmCustomAnnotationValue)
							// We traverse the unparsed array directly, not as an array
							for (Object value : ((JvmCustomAnnotationValue) val).getValues()) {
								if (value instanceof XStringLiteral) {
									String sValue = ((XStringLiteral) value).getValue();
									System.out.println("Adding ouput value: " + sValue);
									outputAllowed.add(sValue);
								}
							}
					}
				}
			}
			
//			for (EStructuralFeature feat : typ.eClass().getEAllStructuralFeatures()) {
//				
//				Object val = typ.eGet(feat);
////				System.out.println("Feature:\n-- " + feat + "\n== " + val);
//			}
		}
		
		inputAllowed.addAll(outputAllowed);
		
		if (checkClass) { 
			for (XtendMember member : clazz.getMembers()) {
				if (member instanceof XtendFunction) {
					XtendFunction f = (XtendFunction) member;
	
					for (EObject content : f.getExpression().eContents()) {
						if (content instanceof XExpression)
							checkSubFunction((XExpression) content, inputAllowed);
					}
				}
			}
		}
	}

	private void checkSubFunctions(Collection<EObject> objs, List<String> inputAllowed) {
		for (EObject obj : objs)
			if (obj instanceof XExpression)
				checkSubFunction((XExpression) obj, inputAllowed);
	}

	private void checkSubFunctionsX(Collection<XExpression> objs, List<String> inputAllowed) {
		for (XExpression obj : objs)
			checkSubFunction(obj, inputAllowed);
	}

	private static HashSet<XExpression> checked = new HashSet<XExpression>();

	private void checkSubFunction(XExpression exp, List<String> inputAllowed) {
		if (exp == null)
			return;
		
		if (checked.contains(exp))
			return;

		checked.add(exp);

		for (EStructuralFeature f : exp.eClass().getEAllStructuralFeatures()) {
			try {
				Object feat = exp.eGet(f);
				if (feat instanceof XExpression)
					checkSubFunction((XExpression) feat, inputAllowed);
				if (feat instanceof JvmMember) {
					JvmMember member = (JvmMember) feat;
					if (illegalType(member.getDeclaringType(), inputAllowed)) {
						error("Illegal model access to "
								+ member.getDeclaringType().getQualifiedName(), exp);
					}
				}
				if (feat instanceof JvmOperation) {
					JvmOperation op = (JvmOperation) feat;
					if (illegalType(op.getReturnType().getType(), inputAllowed)) {
						error("Illegal model access to "
								+ op.getReturnType().getQualifiedName(), exp);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (exp instanceof XAbstractFeatureCall) {
			XAbstractFeatureCall concreteExp = (XAbstractFeatureCall) exp;
			for (XExpression x : concreteExp.getActualArguments())
				checkSubFunction(x, inputAllowed);
			checkSubFunction(concreteExp.getActualReceiver(), inputAllowed);
		} else if (exp instanceof XAbstractWhileExpression) {
			XAbstractWhileExpression concreteExp = (XAbstractWhileExpression) exp;
			checkSubFunction(concreteExp.getPredicate(), inputAllowed);
			checkSubFunction(concreteExp.getBody(), inputAllowed);
		} else if (exp instanceof XBlockExpression) {
			XBlockExpression concreteExp = (XBlockExpression) exp;
			checkSubFunctionsX(concreteExp.getExpressions(), inputAllowed);
		} else if (exp instanceof XCastedExpression) {
			XCastedExpression concreteExp = (XCastedExpression) exp;
//			checkType(concreteExp.getType());
			checkSubFunction(concreteExp.getTarget(), inputAllowed);
		} else if (exp instanceof XClosure) {
			XClosure concreteExp = (XClosure) exp;
			checkSubFunction(concreteExp.getExpression(), inputAllowed);
		}

		checkSubFunctions(exp.eContents(), inputAllowed);
	}

	private boolean illegalType(JvmType type, List<String> inputAllowed) {
		if (type == null)
			return false;

		String fqn = type.getQualifiedName();
		if (fqn.startsWith("cm") || fqn.startsWith("cg"))
			debug = true;
		
		if (debug)
			System.out.println("Checking Type: " + type + ", allowed: " + inputAllowed);
		
//		System.out.println("Checking Type:\n-- " + type);
//		System.out.println("Is EObject descendant?: " + isEObjectSubclass(type));
		
		if (!isEObjectSubclass(type)) {
			debug = false;
			return false;
		}
			
		if (debug)
			System.out.println("Found EObject Subclass: " + type);
		
//		boolean result = !StarImportChecker.check(type.getQualifiedName(), inputAllowed.toArray(new String[0]));
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
