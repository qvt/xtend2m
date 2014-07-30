/**
 */
package cm.repository.impl;

import cm.repository.ComponentType;
import cm.repository.ComponentTypeImplementation;
import cm.repository.RepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.repository.impl.ComponentTypeImplementationImpl#getImplementedComponentTypes <em>Implemented Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentTypeImplementationImpl extends RepositoryComponentImpl implements ComponentTypeImplementation {
	/**
	 * The cached value of the '{@link #getImplementedComponentTypes() <em>Implemented Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> implementedComponentTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPONENT_TYPE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getImplementedComponentTypes() {
		if (implementedComponentTypes == null) {
			implementedComponentTypes = new EObjectResolvingEList<ComponentType>(ComponentType.class, this, RepositoryPackage.COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES);
		}
		return implementedComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES:
				return getImplementedComponentTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES:
				getImplementedComponentTypes().clear();
				getImplementedComponentTypes().addAll((Collection<? extends ComponentType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES:
				getImplementedComponentTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RepositoryPackage.COMPONENT_TYPE_IMPLEMENTATION__IMPLEMENTED_COMPONENT_TYPES:
				return implementedComponentTypes != null && !implementedComponentTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentTypeImplementationImpl
