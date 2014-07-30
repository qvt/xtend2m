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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cm.composition.CompositionPackage
 * @generated
 */
public class CompositionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CompositionValidator INSTANCE = new CompositionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cm.composition";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple Connectors Constraint' of 'Composed Structure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple Connectors Constraint For Assembly Connectors' of 'Composed Structure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Component Of Assembly Context And Inner Role Providing Component Need To Be The Same' of 'Provided Delegation Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROVIDED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Delegation Connectorandtheconnected Componentmustbepartofthesamecompositestructure' of 'Provided Delegation Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROVIDED_DELEGATION_CONNECTOR__PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Assembly Connectors Referenced Provided Roles And Child Context Must Match' of 'Assembly Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Assembly Connectors Referenced Interfaces Must Match' of 'Assembly Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Assembly Connectors Referenced Required Role And Child Context Must Match' of 'Assembly Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Must Have At Least One Provided Role' of 'System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM__SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Has To Be Unique' of 'Identifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDENTIFIER__ID_HAS_TO_BE_UNIQUE = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CompositionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CompositionPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case CompositionPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case CompositionPackage.COMPOSED_STRUCTURE:
				return validateComposedStructure((ComposedStructure)value, diagnostics, context);
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR:
				return validateProvidedDelegationConnector((ProvidedDelegationConnector)value, diagnostics, context);
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR:
				return validateRequiredDelegationConnector((RequiredDelegationConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			case CompositionPackage.SYSTEM:
				return validateSystem((cm.composition.System)value, diagnostics, context);
			case CompositionPackage.SUB_SYSTEM:
				return validateSubSystem((SubSystem)value, diagnostics, context);
			case CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY:
				return validateInterfaceProvidingRequiringEntity((InterfaceProvidingRequiringEntity)value, diagnostics, context);
			case CompositionPackage.INTERFACE_PROVIDING_ENTITY:
				return validateInterfaceProvidingEntity((InterfaceProvidingEntity)value, diagnostics, context);
			case CompositionPackage.INTERFACE_REQUIRING_ENTITY:
				return validateInterfaceRequiringEntity((InterfaceRequiringEntity)value, diagnostics, context);
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY:
				return validateComposedProvidingRequiringEntity((ComposedProvidingRequiringEntity)value, diagnostics, context);
			case CompositionPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case CompositionPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case CompositionPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(connector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composedStructure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraint(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(composedStructure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MultipleConnectorsConstraint constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure_MultipleConnectorsConstraint(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return composedStructure.MultipleConnectorsConstraint(diagnostics, context);
	}

	/**
	 * Validates the MultipleConnectorsConstraintForAssemblyConnectors constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return composedStructure.MultipleConnectorsConstraintForAssemblyConnectors(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(providedDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return providedDelegationConnector.ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(diagnostics, context);
	}

	/**
	 * Validates the ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return providedDelegationConnector.ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(requiredDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyConnectorsReferencedInterfacesMustMatch(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyConnector.AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(diagnostics, context);
	}

	/**
	 * Validates the AssemblyConnectorsReferencedInterfacesMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyConnectorsReferencedInterfacesMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyConnector.AssemblyConnectorsReferencedInterfacesMustMatch(diagnostics, context);
	}

	/**
	 * Validates the AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assemblyConnector.AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(assemblyContext, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(cm.composition.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraint(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystem_SystemMustHaveAtLeastOneProvidedRole(system, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SystemMustHaveAtLeastOneProvidedRole constraint of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem_SystemMustHaveAtLeastOneProvidedRole(cm.composition.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return system.SystemMustHaveAtLeastOneProvidedRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraint(subSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(subSystem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity interfaceProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceProvidingRequiringEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(interfaceProvidingRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceProvidingEntity(InterfaceProvidingEntity interfaceProvidingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceProvidingEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceProvidingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(interfaceProvidingEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRequiringEntity(InterfaceRequiringEntity interfaceRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceRequiringEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(interfaceRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity composedProvidingRequiringEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composedProvidingRequiringEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraint(composedProvidingRequiringEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(composedProvidingRequiringEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(entity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifier_idHasToBeUnique(identifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idHasToBeUnique constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_idHasToBeUnique(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return identifier.idHasToBeUnique(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CompositionValidator
