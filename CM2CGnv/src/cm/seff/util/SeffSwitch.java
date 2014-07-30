/**
 */
package cm.seff.util;

import cm.composition.Entity;
import cm.composition.Identifier;
import cm.composition.NamedElement;

import cm.seff.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cm.seff.SeffPackage
 * @generated
 */
public class SeffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffSwitch() {
		if (modelPackage == null) {
			modelPackage = SeffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION: {
				ServiceEffectSpecification serviceEffectSpecification = (ServiceEffectSpecification)theEObject;
				T result = caseServiceEffectSpecification(serviceEffectSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.INTERNAL_BEHAVIOUR: {
				InternalBehaviour internalBehaviour = (InternalBehaviour)theEObject;
				T result = caseInternalBehaviour(internalBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_ACTION: {
				AbstractAction abstractAction = (AbstractAction)theEObject;
				T result = caseAbstractAction(abstractAction);
				if (result == null) result = caseEntity(abstractAction);
				if (result == null) result = caseNamedElement(abstractAction);
				if (result == null) result = caseIdentifier(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.START_ACTION: {
				StartAction startAction = (StartAction)theEObject;
				T result = caseStartAction(startAction);
				if (result == null) result = caseAbstractAction(startAction);
				if (result == null) result = caseEntity(startAction);
				if (result == null) result = caseNamedElement(startAction);
				if (result == null) result = caseIdentifier(startAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAbstractAction(stopAction);
				if (result == null) result = caseEntity(stopAction);
				if (result == null) result = caseNamedElement(stopAction);
				if (result == null) result = caseIdentifier(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.EXTERNAL_CALL_ACTION: {
				ExternalCallAction externalCallAction = (ExternalCallAction)theEObject;
				T result = caseExternalCallAction(externalCallAction);
				if (result == null) result = caseAbstractAction(externalCallAction);
				if (result == null) result = caseEntity(externalCallAction);
				if (result == null) result = caseNamedElement(externalCallAction);
				if (result == null) result = caseIdentifier(externalCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.BRANCH_ACTION: {
				BranchAction branchAction = (BranchAction)theEObject;
				T result = caseBranchAction(branchAction);
				if (result == null) result = caseAbstractAction(branchAction);
				if (result == null) result = caseEntity(branchAction);
				if (result == null) result = caseNamedElement(branchAction);
				if (result == null) result = caseIdentifier(branchAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION: {
				ProbabilisticBranchTransition probabilisticBranchTransition = (ProbabilisticBranchTransition)theEObject;
				T result = caseProbabilisticBranchTransition(probabilisticBranchTransition);
				if (result == null) result = caseEntity(probabilisticBranchTransition);
				if (result == null) result = caseAutomaton(probabilisticBranchTransition);
				if (result == null) result = caseNamedElement(probabilisticBranchTransition);
				if (result == null) result = caseIdentifier(probabilisticBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.SIMPLE_BEHAVIOR_SPECIFICATION: {
				SimpleBehaviorSpecification simpleBehaviorSpecification = (SimpleBehaviorSpecification)theEObject;
				T result = caseSimpleBehaviorSpecification(simpleBehaviorSpecification);
				if (result == null) result = caseServiceEffectSpecification(simpleBehaviorSpecification);
				if (result == null) result = caseAutomaton(simpleBehaviorSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.INTERNAL_ACTION: {
				InternalAction internalAction = (InternalAction)theEObject;
				T result = caseInternalAction(internalAction);
				if (result == null) result = caseAbstractAction(internalAction);
				if (result == null) result = caseEntity(internalAction);
				if (result == null) result = caseNamedElement(internalAction);
				if (result == null) result = caseIdentifier(internalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.AUTOMATON: {
				Automaton automaton = (Automaton)theEObject;
				T result = caseAutomaton(automaton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Effect Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEffectSpecification(ServiceEffectSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalBehaviour(InternalBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAction(AbstractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartAction(StartAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopAction(StopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCallAction(ExternalCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchAction(BranchAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticBranchTransition(ProbabilisticBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Behavior Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Behavior Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleBehaviorSpecification(SimpleBehaviorSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAction(InternalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automaton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomaton(Automaton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SeffSwitch
