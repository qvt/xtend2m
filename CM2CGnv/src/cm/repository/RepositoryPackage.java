/**
 */
package cm.repository;

import cm.composition.CompositionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cm.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/ComponentModel/Repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = cm.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link cm.repository.impl.RepositoryComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.RepositoryComponentImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getRepositoryComponent()
	 * @generated
	 */
	int REPOSITORY_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__ENTITY_NAME = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__ID = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__PROVIDED_ROLES = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__REQUIRED_ROLES = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__REPOSITORY = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT_FEATURE_COUNT = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT_OPERATION_COUNT = CompositionPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.ComponentTypeImplementationImpl <em>Component Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.ComponentTypeImplementationImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getComponentTypeImplementation()
	 * @generated
	 */
	int COMPONENT_TYPE_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__ID = REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__PROVIDED_ROLES = REPOSITORY_COMPONENT__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__REQUIRED_ROLES = REPOSITORY_COMPONENT__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__REPOSITORY = REPOSITORY_COMPONENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Implemented Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = REPOSITORY_COMPONENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Component Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_IMPLEMENTATION_OPERATION_COUNT = REPOSITORY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.BasicComponentImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getBasicComponent()
	 * @generated
	 */
	int BASIC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ENTITY_NAME = COMPONENT_TYPE_IMPLEMENTATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ID = COMPONENT_TYPE_IMPLEMENTATION__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PROVIDED_ROLES = COMPONENT_TYPE_IMPLEMENTATION__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REQUIRED_ROLES = COMPONENT_TYPE_IMPLEMENTATION__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REPOSITORY = COMPONENT_TYPE_IMPLEMENTATION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Implemented Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__IMPLEMENTED_COMPONENT_TYPES = COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES;

	/**
	 * The feature id for the '<em><b>Service Effect Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS = COMPONENT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_FEATURE_COUNT = COMPONENT_TYPE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = COMPONENT_TYPE_IMPLEMENTATION___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_OPERATION_COUNT = COMPONENT_TYPE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.ComponentTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROVIDED_ROLES = REPOSITORY_COMPONENT__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REQUIRED_ROLES = REPOSITORY_COMPONENT__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REPOSITORY = REPOSITORY_COMPONENT__REPOSITORY;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = REPOSITORY_COMPONENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = REPOSITORY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.RoleImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.ProvidedRoleImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Providing Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__PROVIDING_ENTITY = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__PROVIDED_INTERFACE = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ROLE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.ParameterImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.DataTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.RepositoryImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DESCRIPTION = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENTS = CompositionPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACES = CompositionPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DATA_TYPES = CompositionPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.InterfaceImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Parent Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_INTERFACES = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REPOSITORY = CompositionPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SIGNATURES = CompositionPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.SignatureImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 10;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXCEPTIONS = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = CompositionPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__RETURN_TYPE = CompositionPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__INTERFACE = CompositionPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.ExceptionTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.RequiredRoleImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 12;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Requiring Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__REQUIRING_ENTITY = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__REQUIRED_INTERFACE = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = ROLE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.CompositeComponentImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ENTITY_NAME = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ID = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__CONNECTORS = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Provided Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_ROLES = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES;

	/**
	 * The feature id for the '<em><b>Required Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRED_ROLES = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REPOSITORY = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implemented Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__IMPLEMENTED_COMPONENT_TYPES = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Multiple Connectors Constraint For Assembly Connectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Provide Same Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___PROVIDE_SAME_INTERFACES__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Require Same Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___REQUIRE_SAME_INTERFACES__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link cm.repository.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.PrimitiveDataTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__REPOSITORY = DATA_TYPE__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.CollectionDataTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getCollectionDataType()
	 * @generated
	 */
	int COLLECTION_DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__REPOSITORY = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__INNER_TYPE = CompositionPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Collection Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.CompositeDataTypeImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getCompositeDataType()
	 * @generated
	 */
	int COMPOSITE_DATA_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__ENTITY_NAME = CompositionPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__ID = CompositionPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__REPOSITORY = CompositionPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__PARENT_TYPE = CompositionPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__INNER_DECLARATION = CompositionPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_FEATURE_COUNT = CompositionPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Has To Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = CompositionPackage.ENTITY___ID_HAS_TO_BE_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_OPERATION_COUNT = CompositionPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.impl.InnerDeclarationImpl
	 * @see cm.repository.impl.RepositoryPackageImpl#getInnerDeclaration()
	 * @generated
	 */
	int INNER_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__ENTITY_NAME = CompositionPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__DATA_TYPE = CompositionPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__COMPOSITE_DATA_TYPE = CompositionPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inner Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION_FEATURE_COUNT = CompositionPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inner Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION_OPERATION_COUNT = CompositionPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cm.repository.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cm.repository.PrimitiveType
	 * @see cm.repository.impl.RepositoryPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link cm.repository.BasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component</em>'.
	 * @see cm.repository.BasicComponent
	 * @generated
	 */
	EClass getBasicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.BasicComponent#getServiceEffectSpecifications <em>Service Effect Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Effect Specifications</em>'.
	 * @see cm.repository.BasicComponent#getServiceEffectSpecifications()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EReference getBasicComponent_ServiceEffectSpecifications();

	/**
	 * Returns the meta object for class '{@link cm.repository.ComponentTypeImplementation <em>Component Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Implementation</em>'.
	 * @see cm.repository.ComponentTypeImplementation
	 * @generated
	 */
	EClass getComponentTypeImplementation();

	/**
	 * Returns the meta object for the reference list '{@link cm.repository.ComponentTypeImplementation#getImplementedComponentTypes <em>Implemented Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented Component Types</em>'.
	 * @see cm.repository.ComponentTypeImplementation#getImplementedComponentTypes()
	 * @see #getComponentTypeImplementation()
	 * @generated
	 */
	EReference getComponentTypeImplementation_ImplementedComponentTypes();

	/**
	 * Returns the meta object for class '{@link cm.repository.RepositoryComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cm.repository.RepositoryComponent
	 * @generated
	 */
	EClass getRepositoryComponent();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.RepositoryComponent#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see cm.repository.RepositoryComponent#getRepository()
	 * @see #getRepositoryComponent()
	 * @generated
	 */
	EReference getRepositoryComponent_Repository();

	/**
	 * Returns the meta object for class '{@link cm.repository.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see cm.repository.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for class '{@link cm.repository.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see cm.repository.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.ProvidedRole#getProvidingEntity <em>Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Providing Entity</em>'.
	 * @see cm.repository.ProvidedRole#getProvidingEntity()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_ProvidingEntity();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.ProvidedRole#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface</em>'.
	 * @see cm.repository.ProvidedRole#getProvidedInterface()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_ProvidedInterface();

	/**
	 * Returns the meta object for class '{@link cm.repository.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see cm.repository.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see cm.repository.Parameter#getDataType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DataType();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.Parameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Signature</em>'.
	 * @see cm.repository.Parameter#getSignature()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Signature();

	/**
	 * Returns the meta object for the attribute '{@link cm.repository.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cm.repository.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link cm.repository.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see cm.repository.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.DataType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see cm.repository.DataType#getRepository()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Repository();

	/**
	 * Returns the meta object for class '{@link cm.repository.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cm.repository.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link cm.repository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see cm.repository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link cm.repository.Repository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cm.repository.Repository#getDescription()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Repository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see cm.repository.Repository#getComponents()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Repository#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see cm.repository.Repository#getInterfaces()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Repository#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see cm.repository.Repository#getDataTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_DataTypes();

	/**
	 * Returns the meta object for class '{@link cm.repository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see cm.repository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link cm.repository.Interface#getParentInterfaces <em>Parent Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interfaces</em>'.
	 * @see cm.repository.Interface#getParentInterfaces()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentInterfaces();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.Interface#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see cm.repository.Interface#getRepository()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see cm.repository.Interface#getSignatures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Signatures();

	/**
	 * Returns the meta object for class '{@link cm.repository.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see cm.repository.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Signature#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see cm.repository.Signature#getExceptions()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Exceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see cm.repository.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.Signature#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see cm.repository.Signature#getReturnType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ReturnType();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.Signature#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see cm.repository.Signature#getInterface()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Interface();

	/**
	 * Returns the meta object for class '{@link cm.repository.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see cm.repository.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link cm.repository.ExceptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cm.repository.ExceptionType#getName()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link cm.repository.ExceptionType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see cm.repository.ExceptionType#getMessage()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_Message();

	/**
	 * Returns the meta object for class '{@link cm.repository.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see cm.repository.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.RequiredRole#getRequiringEntity <em>Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requiring Entity</em>'.
	 * @see cm.repository.RequiredRole#getRequiringEntity()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_RequiringEntity();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.RequiredRole#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface</em>'.
	 * @see cm.repository.RequiredRole#getRequiredInterface()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_RequiredInterface();

	/**
	 * Returns the meta object for class '{@link cm.repository.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see cm.repository.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the '{@link cm.repository.CompositeComponent#ProvideSameInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Provide Same Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Provide Same Interfaces</em>' operation.
	 * @see cm.repository.CompositeComponent#ProvideSameInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__ProvideSameInterfaces__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link cm.repository.CompositeComponent#RequireSameInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Require Same Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Require Same Interfaces</em>' operation.
	 * @see cm.repository.CompositeComponent#RequireSameInterfaces(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompositeComponent__RequireSameInterfaces__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link cm.repository.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see cm.repository.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link cm.repository.PrimitiveDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cm.repository.PrimitiveDataType#getType()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_Type();

	/**
	 * Returns the meta object for class '{@link cm.repository.CollectionDataType <em>Collection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Data Type</em>'.
	 * @see cm.repository.CollectionDataType
	 * @generated
	 */
	EClass getCollectionDataType();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.CollectionDataType#getInnerType <em>Inner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Type</em>'.
	 * @see cm.repository.CollectionDataType#getInnerType()
	 * @see #getCollectionDataType()
	 * @generated
	 */
	EReference getCollectionDataType_InnerType();

	/**
	 * Returns the meta object for class '{@link cm.repository.CompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Type</em>'.
	 * @see cm.repository.CompositeDataType
	 * @generated
	 */
	EClass getCompositeDataType();

	/**
	 * Returns the meta object for the reference list '{@link cm.repository.CompositeDataType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type</em>'.
	 * @see cm.repository.CompositeDataType#getParentType()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_ParentType();

	/**
	 * Returns the meta object for the containment reference list '{@link cm.repository.CompositeDataType#getInnerDeclaration <em>Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Declaration</em>'.
	 * @see cm.repository.CompositeDataType#getInnerDeclaration()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_InnerDeclaration();

	/**
	 * Returns the meta object for class '{@link cm.repository.InnerDeclaration <em>Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Declaration</em>'.
	 * @see cm.repository.InnerDeclaration
	 * @generated
	 */
	EClass getInnerDeclaration();

	/**
	 * Returns the meta object for the reference '{@link cm.repository.InnerDeclaration#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see cm.repository.InnerDeclaration#getDataType()
	 * @see #getInnerDeclaration()
	 * @generated
	 */
	EReference getInnerDeclaration_DataType();

	/**
	 * Returns the meta object for the container reference '{@link cm.repository.InnerDeclaration#getCompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composite Data Type</em>'.
	 * @see cm.repository.InnerDeclaration#getCompositeDataType()
	 * @see #getInnerDeclaration()
	 * @generated
	 */
	EReference getInnerDeclaration_CompositeDataType();

	/**
	 * Returns the meta object for enum '{@link cm.repository.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see cm.repository.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link cm.repository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.BasicComponentImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getBasicComponent()
		 * @generated
		 */
		EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

		/**
		 * The meta object literal for the '<em><b>Service Effect Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS = eINSTANCE.getBasicComponent_ServiceEffectSpecifications();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.ComponentTypeImplementationImpl <em>Component Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.ComponentTypeImplementationImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getComponentTypeImplementation()
		 * @generated
		 */
		EClass COMPONENT_TYPE_IMPLEMENTATION = eINSTANCE.getComponentTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Implemented Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES = eINSTANCE.getComponentTypeImplementation_ImplementedComponentTypes();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.RepositoryComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.RepositoryComponentImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getRepositoryComponent()
		 * @generated
		 */
		EClass REPOSITORY_COMPONENT = eINSTANCE.getRepositoryComponent();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_COMPONENT__REPOSITORY = eINSTANCE.getRepositoryComponent_Repository();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.ComponentTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.ProvidedRoleImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Providing Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__PROVIDING_ENTITY = eINSTANCE.getProvidedRole_ProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__PROVIDED_INTERFACE = eINSTANCE.getProvidedRole_ProvidedInterface();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.ParameterImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SIGNATURE = eINSTANCE.getParameter_Signature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.DataTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__REPOSITORY = eINSTANCE.getDataType_Repository();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.RoleImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.RepositoryImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DESCRIPTION = eINSTANCE.getRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENTS = eINSTANCE.getRepository_Components();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACES = eINSTANCE.getRepository_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__DATA_TYPES = eINSTANCE.getRepository_DataTypes();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.InterfaceImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_INTERFACES = eINSTANCE.getInterface_ParentInterfaces();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REPOSITORY = eINSTANCE.getInterface_Repository();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SIGNATURES = eINSTANCE.getInterface_Signatures();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.SignatureImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__EXCEPTIONS = eINSTANCE.getSignature_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__RETURN_TYPE = eINSTANCE.getSignature_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__INTERFACE = eINSTANCE.getSignature_Interface();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.ExceptionTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__NAME = eINSTANCE.getExceptionType_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__MESSAGE = eINSTANCE.getExceptionType_Message();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.RequiredRoleImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Requiring Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__REQUIRING_ENTITY = eINSTANCE.getRequiredRole_RequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__REQUIRED_INTERFACE = eINSTANCE.getRequiredRole_RequiredInterface();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.CompositeComponentImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Provide Same Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___PROVIDE_SAME_INTERFACES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCompositeComponent__ProvideSameInterfaces__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Require Same Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_COMPONENT___REQUIRE_SAME_INTERFACES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCompositeComponent__RequireSameInterfaces__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.PrimitiveDataTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType_Type();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.CollectionDataTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getCollectionDataType()
		 * @generated
		 */
		EClass COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType();

		/**
		 * The meta object literal for the '<em><b>Inner Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_DATA_TYPE__INNER_TYPE = eINSTANCE.getCollectionDataType_InnerType();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.CompositeDataTypeImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getCompositeDataType()
		 * @generated
		 */
		EClass COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__PARENT_TYPE = eINSTANCE.getCompositeDataType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Inner Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__INNER_DECLARATION = eINSTANCE.getCompositeDataType_InnerDeclaration();

		/**
		 * The meta object literal for the '{@link cm.repository.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.impl.InnerDeclarationImpl
		 * @see cm.repository.impl.RepositoryPackageImpl#getInnerDeclaration()
		 * @generated
		 */
		EClass INNER_DECLARATION = eINSTANCE.getInnerDeclaration();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DECLARATION__DATA_TYPE = eINSTANCE.getInnerDeclaration_DataType();

		/**
		 * The meta object literal for the '<em><b>Composite Data Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DECLARATION__COMPOSITE_DATA_TYPE = eINSTANCE.getInnerDeclaration_CompositeDataType();

		/**
		 * The meta object literal for the '{@link cm.repository.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cm.repository.PrimitiveType
		 * @see cm.repository.impl.RepositoryPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //RepositoryPackage
