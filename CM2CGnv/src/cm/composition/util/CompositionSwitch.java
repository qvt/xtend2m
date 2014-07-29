/**
 */
package cm.composition.util;

import cm.composition.AssemblyConnector;
import cm.composition.AssemblyContext;
import cm.composition.ComposedProvidingRequiringEntity;
import cm.composition.ComposedStructure;
import cm.composition.CompositionPackage;
import cm.composition.Connector;
import cm.composition.DelegationConnector;
import cm.composition.Entity;
import cm.composition.Identifier;
import cm.composition.InterfaceProvidingEntity;
import cm.composition.InterfaceProvidingRequiringEntity;
import cm.composition.InterfaceRequiringEntity;
import cm.composition.NamedElement;
import cm.composition.ProvidedDelegationConnector;
import cm.composition.RequiredDelegationConnector;
import cm.composition.SubSystem;

import cm.repository.RepositoryComponent;

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
 * @see cm.composition.CompositionPackage
 * @generated
 */
public class CompositionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompositionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSwitch() {
		if (modelPackage == null) {
			modelPackage = CompositionPackage.eINSTANCE;
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
			case CompositionPackage.DELEGATION_CONNECTOR: {
				DelegationConnector delegationConnector = (DelegationConnector)theEObject;
				T result = caseDelegationConnector(delegationConnector);
				if (result == null) result = caseConnector(delegationConnector);
				if (result == null) result = caseEntity(delegationConnector);
				if (result == null) result = caseNamedElement(delegationConnector);
				if (result == null) result = caseIdentifier(delegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseEntity(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = caseIdentifier(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.COMPOSED_STRUCTURE: {
				ComposedStructure composedStructure = (ComposedStructure)theEObject;
				T result = caseComposedStructure(composedStructure);
				if (result == null) result = caseEntity(composedStructure);
				if (result == null) result = caseNamedElement(composedStructure);
				if (result == null) result = caseIdentifier(composedStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR: {
				ProvidedDelegationConnector providedDelegationConnector = (ProvidedDelegationConnector)theEObject;
				T result = caseProvidedDelegationConnector(providedDelegationConnector);
				if (result == null) result = caseDelegationConnector(providedDelegationConnector);
				if (result == null) result = caseConnector(providedDelegationConnector);
				if (result == null) result = caseEntity(providedDelegationConnector);
				if (result == null) result = caseNamedElement(providedDelegationConnector);
				if (result == null) result = caseIdentifier(providedDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR: {
				RequiredDelegationConnector requiredDelegationConnector = (RequiredDelegationConnector)theEObject;
				T result = caseRequiredDelegationConnector(requiredDelegationConnector);
				if (result == null) result = caseDelegationConnector(requiredDelegationConnector);
				if (result == null) result = caseConnector(requiredDelegationConnector);
				if (result == null) result = caseEntity(requiredDelegationConnector);
				if (result == null) result = caseNamedElement(requiredDelegationConnector);
				if (result == null) result = caseIdentifier(requiredDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.ASSEMBLY_CONNECTOR: {
				AssemblyConnector assemblyConnector = (AssemblyConnector)theEObject;
				T result = caseAssemblyConnector(assemblyConnector);
				if (result == null) result = caseConnector(assemblyConnector);
				if (result == null) result = caseEntity(assemblyConnector);
				if (result == null) result = caseNamedElement(assemblyConnector);
				if (result == null) result = caseIdentifier(assemblyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.ASSEMBLY_CONTEXT: {
				AssemblyContext assemblyContext = (AssemblyContext)theEObject;
				T result = caseAssemblyContext(assemblyContext);
				if (result == null) result = caseEntity(assemblyContext);
				if (result == null) result = caseNamedElement(assemblyContext);
				if (result == null) result = caseIdentifier(assemblyContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.SYSTEM: {
				cm.composition.System system = (cm.composition.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseComposedProvidingRequiringEntity(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = caseIdentifier(system);
				if (result == null) result = caseComposedStructure(system);
				if (result == null) result = caseInterfaceProvidingRequiringEntity(system);
				if (result == null) result = caseInterfaceProvidingEntity(system);
				if (result == null) result = caseInterfaceRequiringEntity(system);
				if (result == null) result = caseEntity(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.SUB_SYSTEM: {
				SubSystem subSystem = (SubSystem)theEObject;
				T result = caseSubSystem(subSystem);
				if (result == null) result = caseComposedProvidingRequiringEntity(subSystem);
				if (result == null) result = caseRepositoryComponent(subSystem);
				if (result == null) result = caseComposedStructure(subSystem);
				if (result == null) result = caseInterfaceProvidingRequiringEntity(subSystem);
				if (result == null) result = caseInterfaceProvidingEntity(subSystem);
				if (result == null) result = caseInterfaceRequiringEntity(subSystem);
				if (result == null) result = caseEntity(subSystem);
				if (result == null) result = caseNamedElement(subSystem);
				if (result == null) result = caseIdentifier(subSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY: {
				InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity = (InterfaceProvidingRequiringEntity)theEObject;
				T result = caseInterfaceProvidingRequiringEntity(interfaceProvidingRequiringEntity);
				if (result == null) result = caseInterfaceProvidingEntity(interfaceProvidingRequiringEntity);
				if (result == null) result = caseInterfaceRequiringEntity(interfaceProvidingRequiringEntity);
				if (result == null) result = caseEntity(interfaceProvidingRequiringEntity);
				if (result == null) result = caseNamedElement(interfaceProvidingRequiringEntity);
				if (result == null) result = caseIdentifier(interfaceProvidingRequiringEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.INTERFACE_PROVIDING_ENTITY: {
				InterfaceProvidingEntity interfaceProvidingEntity = (InterfaceProvidingEntity)theEObject;
				T result = caseInterfaceProvidingEntity(interfaceProvidingEntity);
				if (result == null) result = caseEntity(interfaceProvidingEntity);
				if (result == null) result = caseNamedElement(interfaceProvidingEntity);
				if (result == null) result = caseIdentifier(interfaceProvidingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.INTERFACE_REQUIRING_ENTITY: {
				InterfaceRequiringEntity interfaceRequiringEntity = (InterfaceRequiringEntity)theEObject;
				T result = caseInterfaceRequiringEntity(interfaceRequiringEntity);
				if (result == null) result = caseEntity(interfaceRequiringEntity);
				if (result == null) result = caseNamedElement(interfaceRequiringEntity);
				if (result == null) result = caseIdentifier(interfaceRequiringEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY: {
				ComposedProvidingRequiringEntity composedProvidingRequiringEntity = (ComposedProvidingRequiringEntity)theEObject;
				T result = caseComposedProvidingRequiringEntity(composedProvidingRequiringEntity);
				if (result == null) result = caseComposedStructure(composedProvidingRequiringEntity);
				if (result == null) result = caseInterfaceProvidingRequiringEntity(composedProvidingRequiringEntity);
				if (result == null) result = caseInterfaceProvidingEntity(composedProvidingRequiringEntity);
				if (result == null) result = caseInterfaceRequiringEntity(composedProvidingRequiringEntity);
				if (result == null) result = caseEntity(composedProvidingRequiringEntity);
				if (result == null) result = caseNamedElement(composedProvidingRequiringEntity);
				if (result == null) result = caseIdentifier(composedProvidingRequiringEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = caseIdentifier(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnector(DelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedStructure(ComposedStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedDelegationConnector(ProvidedDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredDelegationConnector(RequiredDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyConnector(AssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyContext(AssemblyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(cm.composition.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Providing Requiring Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Providing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Requiring Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Providing Requiring Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryComponent(RepositoryComponent object) {
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

} //CompositionSwitch
