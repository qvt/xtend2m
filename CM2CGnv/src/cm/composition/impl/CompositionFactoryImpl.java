/**
 */
package cm.composition.impl;

import cm.composition.AssemblyConnector;
import cm.composition.AssemblyContext;
import cm.composition.CompositionFactory;
import cm.composition.CompositionPackage;
import cm.composition.ProvidedDelegationConnector;
import cm.composition.RequiredDelegationConnector;
import cm.composition.SubSystem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionFactoryImpl extends EFactoryImpl implements CompositionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositionFactory init() {
		try {
			CompositionFactory theCompositionFactory = (CompositionFactory)EPackage.Registry.INSTANCE.getEFactory(CompositionPackage.eNS_URI);
			if (theCompositionFactory != null) {
				return theCompositionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompositionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR: return createProvidedDelegationConnector();
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR: return createRequiredDelegationConnector();
			case CompositionPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case CompositionPackage.ASSEMBLY_CONTEXT: return createAssemblyContext();
			case CompositionPackage.SYSTEM: return createSystem();
			case CompositionPackage.SUB_SYSTEM: return createSubSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedDelegationConnector createProvidedDelegationConnector() {
		ProvidedDelegationConnectorImpl providedDelegationConnector = new ProvidedDelegationConnectorImpl();
		return providedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredDelegationConnector createRequiredDelegationConnector() {
		RequiredDelegationConnectorImpl requiredDelegationConnector = new RequiredDelegationConnectorImpl();
		return requiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext createAssemblyContext() {
		AssemblyContextImpl assemblyContext = new AssemblyContextImpl();
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cm.composition.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionPackage getCompositionPackage() {
		return (CompositionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompositionPackage getPackage() {
		return CompositionPackage.eINSTANCE;
	}

} //CompositionFactoryImpl
