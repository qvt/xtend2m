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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cm.composition.CompositionPackage
 * @generated
 */
public class CompositionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompositionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CompositionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionSwitch<Adapter> modelSwitch =
		new CompositionSwitch<Adapter>() {
			@Override
			public Adapter caseDelegationConnector(DelegationConnector object) {
				return createDelegationConnectorAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseComposedStructure(ComposedStructure object) {
				return createComposedStructureAdapter();
			}
			@Override
			public Adapter caseProvidedDelegationConnector(ProvidedDelegationConnector object) {
				return createProvidedDelegationConnectorAdapter();
			}
			@Override
			public Adapter caseRequiredDelegationConnector(RequiredDelegationConnector object) {
				return createRequiredDelegationConnectorAdapter();
			}
			@Override
			public Adapter caseAssemblyConnector(AssemblyConnector object) {
				return createAssemblyConnectorAdapter();
			}
			@Override
			public Adapter caseAssemblyContext(AssemblyContext object) {
				return createAssemblyContextAdapter();
			}
			@Override
			public Adapter caseSystem(cm.composition.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
				return createInterfaceProvidingRequiringEntityAdapter();
			}
			@Override
			public Adapter caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
				return createInterfaceProvidingEntityAdapter();
			}
			@Override
			public Adapter caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
				return createInterfaceRequiringEntityAdapter();
			}
			@Override
			public Adapter caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
				return createComposedProvidingRequiringEntityAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseRepositoryComponent(RepositoryComponent object) {
				return createRepositoryComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.DelegationConnector
	 * @generated
	 */
	public Adapter createDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.ComposedStructure <em>Composed Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.ComposedStructure
	 * @generated
	 */
	public Adapter createComposedStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.ProvidedDelegationConnector <em>Provided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.ProvidedDelegationConnector
	 * @generated
	 */
	public Adapter createProvidedDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.RequiredDelegationConnector <em>Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.RequiredDelegationConnector
	 * @generated
	 */
	public Adapter createRequiredDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.AssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.AssemblyConnector
	 * @generated
	 */
	public Adapter createAssemblyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.AssemblyContext
	 * @generated
	 */
	public Adapter createAssemblyContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.InterfaceProvidingRequiringEntity
	 * @generated
	 */
	public Adapter createInterfaceProvidingRequiringEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.InterfaceProvidingEntity <em>Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.InterfaceProvidingEntity
	 * @generated
	 */
	public Adapter createInterfaceProvidingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.InterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.InterfaceRequiringEntity
	 * @generated
	 */
	public Adapter createInterfaceRequiringEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.ComposedProvidingRequiringEntity
	 * @generated
	 */
	public Adapter createComposedProvidingRequiringEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.composition.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.composition.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cm.repository.RepositoryComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cm.repository.RepositoryComponent
	 * @generated
	 */
	public Adapter createRepositoryComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CompositionAdapterFactory
