/**
 */
package cm.composition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A package holding all composable entities
 * <!-- end-model-doc -->
 * @see cm.composition.CompositionFactory
 * @model kind="package"
 * @generated
 */
public interface CompositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "composition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/ComponentModel/Composition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "composition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = cm.composition.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link cm.composition.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.NamedElementImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ENTITY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.EntityImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_NAME = NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cm.composition.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.ConnectorImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT_STRUCTURE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.DelegationConnectorImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ENTITY_NAME = CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PARENT_STRUCTURE = CONNECTOR__PARENT_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.ComposedStructureImpl <em>Composed Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.ComposedStructureImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getComposedStructure()
	 * @generated
	 */
	int COMPOSED_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__CONNECTORS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composed Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cm.composition.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.ProvidedDelegationConnectorImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getProvidedDelegationConnector()
	 * @generated
	 */
	int PROVIDED_DELEGATION_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__ENTITY_NAME = DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__ID = DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__PARENT_STRUCTURE = DELEGATION_CONNECTOR__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Inner Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = DELEGATION_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Component Of Assembly Context And Inner Role Providing Component Need To Be The Same</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR___COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME__DIAGNOSTICCHAIN_MAP = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Provided Delegation Connectorandtheconnected Componentmustbepartofthesamecompositestructure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR___PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__DIAGNOSTICCHAIN_MAP = DELEGATION_CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cm.composition.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.RequiredDelegationConnectorImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getRequiredDelegationConnector()
	 * @generated
	 */
	int REQUIRED_DELEGATION_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__ENTITY_NAME = DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__ID = DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE = DELEGATION_CONNECTOR__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Inner Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE = DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT = DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_FEATURE_COUNT = DELEGATION_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = DELEGATION_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_DELEGATION_CONNECTOR_OPERATION_COUNT = DELEGATION_CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.AssemblyConnectorImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getAssemblyConnector()
	 * @generated
	 */
	int ASSEMBLY_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__ENTITY_NAME = CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PARENT_STRUCTURE = CONNECTOR__PARENT_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Requiring Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providing Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__PROVIDED_ROLE = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR__REQUIRED_ROLE = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CONNECTOR___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Provided Roles And Child Context Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Interfaces Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__DIAGNOSTICCHAIN_MAP = CONNECTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Assembly Connectors Referenced Required Role And Child Context Must Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = CONNECTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assembly Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link cm.composition.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.AssemblyContextImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PARENT_STRUCTURE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.SystemImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSEMBLY_CONTEXTS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROVIDED_ROLES = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_ROLES = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>System Must Have At Least One Provided Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link cm.composition.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.ComposedProvidingRequiringEntityImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getComposedProvidingRequiringEntity()
	 * @generated
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = COMPOSED_STRUCTURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ID = COMPOSED_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS = COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS = COMPOSED_STRUCTURE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES = COMPOSED_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES = COMPOSED_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = COMPOSED_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = COMPOSED_STRUCTURE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Composed Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = COMPOSED_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.SubSystemImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ENTITY_NAME = COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ID = COMPOSED_PROVIDING_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ASSEMBLY_CONTEXTS = COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__CONNECTORS = COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__PROVIDED_ROLES = COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__REQUIRED_ROLES = COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__REPOSITORY = COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = COMPOSED_PROVIDING_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.InterfaceProvidingEntityImpl <em>Interface Providing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.InterfaceProvidingEntityImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceProvidingEntity()
	 * @generated
	 */
	int INTERFACE_PROVIDING_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.InterfaceProvidingRequiringEntityImpl <em>Interface Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.InterfaceProvidingRequiringEntityImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceProvidingRequiringEntity()
	 * @generated
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = INTERFACE_PROVIDING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__ID = INTERFACE_PROVIDING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES = INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES = INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = INTERFACE_PROVIDING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = INTERFACE_PROVIDING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.InterfaceRequiringEntityImpl <em>Interface Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.InterfaceRequiringEntityImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceRequiringEntity()
	 * @generated
	 */
	int INTERFACE_REQUIRING_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.composition.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.composition.impl.IdentifierImpl
	 * @see cm.composition.impl.CompositionPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link cm.composition.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see cm.composition.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the meta object for class '{@link cm.composition.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cm.composition.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the container reference '{@link cm.composition.Connector#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see cm.composition.Connector#getParentStructure()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ParentStructure();

	/**
	 * Returns the meta object for class '{@link cm.composition.ComposedStructure <em>Composed Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Structure</em>'.
	 * @see cm.composition.ComposedStructure
	 * @generated
	 */
	EClass getComposedStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.composition.ComposedStructure#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Contexts</em>'.
	 * @see cm.composition.ComposedStructure#getAssemblyContexts()
	 * @see #getComposedStructure()
	 * @generated
	 */
	EReference getComposedStructure_AssemblyContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.composition.ComposedStructure#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see cm.composition.ComposedStructure#getConnectors()
	 * @see #getComposedStructure()
	 * @generated
	 */
	EReference getComposedStructure_Connectors();

	/**
	 * Returns the meta object for the '{@link cm.composition.ComposedStructure#MultipleConnectorsConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Multiple Connectors Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiple Connectors Constraint</em>' operation.
	 * @see cm.composition.ComposedStructure#MultipleConnectorsConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComposedStructure__MultipleConnectorsConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link cm.composition.ComposedStructure#MultipleConnectorsConstraintForAssemblyConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Multiple Connectors Constraint For Assembly Connectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * @see cm.composition.ComposedStructure#MultipleConnectorsConstraintForAssemblyConnectors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComposedStructure__MultipleConnectorsConstraintForAssemblyConnectors__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cm.composition.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Delegation Connector</em>'.
	 * @see cm.composition.ProvidedDelegationConnector
	 * @generated
	 */
	EClass getProvidedDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Provided Role</em>'.
	 * @see cm.composition.ProvidedDelegationConnector#getInnerProvidedRole()
	 * @see #getProvidedDelegationConnector()
	 * @generated
	 */
	EReference getProvidedDelegationConnector_InnerProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Provided Role</em>'.
	 * @see cm.composition.ProvidedDelegationConnector#getOuterProvidedRole()
	 * @see #getProvidedDelegationConnector()
	 * @generated
	 */
	EReference getProvidedDelegationConnector_OuterProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.ProvidedDelegationConnector#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see cm.composition.ProvidedDelegationConnector#getAssemblyContext()
	 * @see #getProvidedDelegationConnector()
	 * @generated
	 */
	EReference getProvidedDelegationConnector_AssemblyContext();

	/**
	 * Returns the meta object for the '{@link cm.composition.ProvidedDelegationConnector#ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Component Of Assembly Context And Inner Role Providing Component Need To Be The Same</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Component Of Assembly Context And Inner Role Providing Component Need To Be The Same</em>' operation.
	 * @see cm.composition.ProvidedDelegationConnector#ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProvidedDelegationConnector__ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link cm.composition.ProvidedDelegationConnector#ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provided Delegation Connectorandtheconnected Componentmustbepartofthesamecompositestructure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provided Delegation Connectorandtheconnected Componentmustbepartofthesamecompositestructure</em>' operation.
	 * @see cm.composition.ProvidedDelegationConnector#ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProvidedDelegationConnector__ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cm.composition.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Delegation Connector</em>'.
	 * @see cm.composition.RequiredDelegationConnector
	 * @generated
	 */
	EClass getRequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Required Role</em>'.
	 * @see cm.composition.RequiredDelegationConnector#getInnerRequiredRole()
	 * @see #getRequiredDelegationConnector()
	 * @generated
	 */
	EReference getRequiredDelegationConnector_InnerRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Required Role</em>'.
	 * @see cm.composition.RequiredDelegationConnector#getOuterRequiredRole()
	 * @see #getRequiredDelegationConnector()
	 * @generated
	 */
	EReference getRequiredDelegationConnector_OuterRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.RequiredDelegationConnector#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see cm.composition.RequiredDelegationConnector#getAssemblyContext()
	 * @see #getRequiredDelegationConnector()
	 * @generated
	 */
	EReference getRequiredDelegationConnector_AssemblyContext();

	/**
	 * Returns the meta object for class '{@link cm.composition.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Connector</em>'.
	 * @see cm.composition.AssemblyConnector
	 * @generated
	 */
	EClass getAssemblyConnector();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.AssemblyConnector#getRequiringAssemblyContext <em>Requiring Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requiring Assembly Context</em>'.
	 * @see cm.composition.AssemblyConnector#getRequiringAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiringAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.AssemblyConnector#getProvidingAssemblyContext <em>Providing Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providing Assembly Context</em>'.
	 * @see cm.composition.AssemblyConnector#getProvidingAssemblyContext()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidingAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see cm.composition.AssemblyConnector#getProvidedRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see cm.composition.AssemblyConnector#getRequiredRole()
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	EReference getAssemblyConnector_RequiredRole();

	/**
	 * Returns the meta object for the '{@link cm.composition.AssemblyConnector#AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Assembly Connectors Referenced Provided Roles And Child Context Must Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assembly Connectors Referenced Provided Roles And Child Context Must Match</em>' operation.
	 * @see cm.composition.AssemblyConnector#AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link cm.composition.AssemblyConnector#AssemblyConnectorsReferencedInterfacesMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Assembly Connectors Referenced Interfaces Must Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assembly Connectors Referenced Interfaces Must Match</em>' operation.
	 * @see cm.composition.AssemblyConnector#AssemblyConnectorsReferencedInterfacesMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__AssemblyConnectorsReferencedInterfacesMustMatch__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link cm.composition.AssemblyConnector#AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Assembly Connectors Referenced Required Role And Child Context Must Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assembly Connectors Referenced Required Role And Child Context Must Match</em>' operation.
	 * @see cm.composition.AssemblyConnector#AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssemblyConnector__AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cm.composition.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Context</em>'.
	 * @see cm.composition.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the container reference '{@link cm.composition.AssemblyContext#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see cm.composition.AssemblyContext#getParentStructure()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ParentStructure();

	/**
	 * Returns the meta object for the reference '{@link cm.composition.AssemblyContext#getEncapsulatedComponent <em>Encapsulated Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Encapsulated Component</em>'.
	 * @see cm.composition.AssemblyContext#getEncapsulatedComponent()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_EncapsulatedComponent();

	/**
	 * Returns the meta object for class '{@link cm.composition.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see cm.composition.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the '{@link cm.composition.System#SystemMustHaveAtLeastOneProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>System Must Have At Least One Provided Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>System Must Have At Least One Provided Role</em>' operation.
	 * @see cm.composition.System#SystemMustHaveAtLeastOneProvidedRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSystem__SystemMustHaveAtLeastOneProvidedRole__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cm.composition.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see cm.composition.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for class '{@link cm.composition.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Providing Requiring Entity</em>'.
	 * @see cm.composition.InterfaceProvidingRequiringEntity
	 * @generated
	 */
	EClass getInterfaceProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link cm.composition.InterfaceProvidingEntity <em>Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Providing Entity</em>'.
	 * @see cm.composition.InterfaceProvidingEntity
	 * @generated
	 */
	EClass getInterfaceProvidingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.composition.InterfaceProvidingEntity#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Roles</em>'.
	 * @see cm.composition.InterfaceProvidingEntity#getProvidedRoles()
	 * @see #getInterfaceProvidingEntity()
	 * @generated
	 */
	EReference getInterfaceProvidingEntity_ProvidedRoles();

	/**
	 * Returns the meta object for class '{@link cm.composition.InterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Requiring Entity</em>'.
	 * @see cm.composition.InterfaceRequiringEntity
	 * @generated
	 */
	EClass getInterfaceRequiringEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.composition.InterfaceRequiringEntity#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Roles</em>'.
	 * @see cm.composition.InterfaceRequiringEntity#getRequiredRoles()
	 * @see #getInterfaceRequiringEntity()
	 * @generated
	 */
	EReference getInterfaceRequiringEntity_RequiredRoles();

	/**
	 * Returns the meta object for class '{@link cm.composition.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Providing Requiring Entity</em>'.
	 * @see cm.composition.ComposedProvidingRequiringEntity
	 * @generated
	 */
	EClass getComposedProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link cm.composition.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see cm.composition.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link cm.composition.NamedElement#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see cm.composition.NamedElement#getEntityName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_EntityName();

	/**
	 * Returns the meta object for class '{@link cm.composition.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see cm.composition.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link cm.composition.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see cm.composition.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link cm.composition.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cm.composition.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for the '{@link cm.composition.Identifier#idHasToBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Has To Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Has To Be Unique</em>' operation.
	 * @see cm.composition.Identifier#idHasToBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdentifier__IdHasToBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositionFactory getCompositionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cm.composition.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.DelegationConnectorImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.ConnectorImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT_STRUCTURE = eINSTANCE.getConnector_ParentStructure();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.ComposedStructureImpl <em>Composed Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.ComposedStructureImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getComposedStructure()
		 * @generated
		 */
		EClass COMPOSED_STRUCTURE = eINSTANCE.getComposedStructure();

		/**
		 * The meta object literal for the '<em><b>Assembly Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS = eINSTANCE.getComposedStructure_AssemblyContexts();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_STRUCTURE__CONNECTORS = eINSTANCE.getComposedStructure_Connectors();

		/**
		 * The meta object literal for the '<em><b>Multiple Connectors Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComposedStructure__MultipleConnectorsConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Multiple Connectors Constraint For Assembly Connectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComposedStructure__MultipleConnectorsConstraintForAssemblyConnectors__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.ProvidedDelegationConnectorImpl <em>Provided Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.ProvidedDelegationConnectorImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getProvidedDelegationConnector()
		 * @generated
		 */
		EClass PROVIDED_DELEGATION_CONNECTOR = eINSTANCE.getProvidedDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE = eINSTANCE.getProvidedDelegationConnector_InnerProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Outer Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE = eINSTANCE.getProvidedDelegationConnector_OuterProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT = eINSTANCE.getProvidedDelegationConnector_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Component Of Assembly Context And Inner Role Providing Component Need To Be The Same</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDED_DELEGATION_CONNECTOR___COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProvidedDelegationConnector__ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Provided Delegation Connectorandtheconnected Componentmustbepartofthesamecompositestructure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDED_DELEGATION_CONNECTOR___PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProvidedDelegationConnector__ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.RequiredDelegationConnectorImpl <em>Required Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.RequiredDelegationConnectorImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getRequiredDelegationConnector()
		 * @generated
		 */
		EClass REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getRequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE = eINSTANCE.getRequiredDelegationConnector_InnerRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Outer Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE = eINSTANCE.getRequiredDelegationConnector_OuterRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT = eINSTANCE.getRequiredDelegationConnector_AssemblyContext();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.AssemblyConnectorImpl <em>Assembly Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.AssemblyConnectorImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getAssemblyConnector()
		 * @generated
		 */
		EClass ASSEMBLY_CONNECTOR = eINSTANCE.getAssemblyConnector();

		/**
		 * The meta object literal for the '<em><b>Requiring Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_RequiringAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Providing Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyConnector_ProvidingAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__PROVIDED_ROLE = eINSTANCE.getAssemblyConnector_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONNECTOR__REQUIRED_ROLE = eINSTANCE.getAssemblyConnector_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors Referenced Provided Roles And Child Context Must Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssemblyConnector__AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors Referenced Interfaces Must Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssemblyConnector__AssemblyConnectorsReferencedInterfacesMustMatch__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Assembly Connectors Referenced Required Role And Child Context Must Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssemblyConnector__AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.AssemblyContextImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PARENT_STRUCTURE = eINSTANCE.getAssemblyContext_ParentStructure();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT = eINSTANCE.getAssemblyContext_EncapsulatedComponent();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.SystemImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>System Must Have At Least One Provided Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSystem__SystemMustHaveAtLeastOneProvidedRole__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.SubSystemImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.InterfaceProvidingRequiringEntityImpl <em>Interface Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.InterfaceProvidingRequiringEntityImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceProvidingRequiringEntity()
		 * @generated
		 */
		EClass INTERFACE_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getInterfaceProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.InterfaceProvidingEntityImpl <em>Interface Providing Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.InterfaceProvidingEntityImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceProvidingEntity()
		 * @generated
		 */
		EClass INTERFACE_PROVIDING_ENTITY = eINSTANCE.getInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Provided Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES = eINSTANCE.getInterfaceProvidingEntity_ProvidedRoles();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.InterfaceRequiringEntityImpl <em>Interface Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.InterfaceRequiringEntityImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getInterfaceRequiringEntity()
		 * @generated
		 */
		EClass INTERFACE_REQUIRING_ENTITY = eINSTANCE.getInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Required Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES = eINSTANCE.getInterfaceRequiringEntity_RequiredRoles();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.ComposedProvidingRequiringEntityImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getComposedProvidingRequiringEntity()
		 * @generated
		 */
		EClass COMPOSED_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getComposedProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.NamedElementImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ENTITY_NAME = eINSTANCE.getNamedElement_EntityName();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.EntityImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link cm.composition.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.composition.impl.IdentifierImpl
		 * @see cm.composition.impl.CompositionPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Id Has To Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIER___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdentifier__IdHasToBeUnique__DiagnosticChain_Map();

	}

} //CompositionPackage
