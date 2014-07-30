/**
 */
package cm.composition.impl;

import cm.composition.ComposedProvidingRequiringEntity;
import cm.composition.CompositionPackage;
import cm.composition.InterfaceProvidingEntity;
import cm.composition.InterfaceProvidingRequiringEntity;
import cm.composition.InterfaceRequiringEntity;

import cm.repository.ProvidedRole;
import cm.repository.RepositoryPackage;
import cm.repository.RequiredRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.composition.impl.ComposedProvidingRequiringEntityImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link cm.composition.impl.ComposedProvidingRequiringEntityImpl#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComposedProvidingRequiringEntityImpl extends ComposedStructureImpl implements ComposedProvidingRequiringEntity {
	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedProvidingRequiringEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.COMPOSED_PROVIDING_REQUIRING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES, RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES, RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles()).basicAdd(otherEnd, msgs);
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				return ((InternalEList<?>)getProvidedRoles()).basicRemove(otherEnd, msgs);
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				return ((InternalEList<?>)getRequiredRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				return getProvidedRoles();
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				return getRequiredRoles();
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
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
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
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				getRequiredRoles().clear();
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
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES:
				return requiredRoles != null && !requiredRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES: return CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES: return CompositionPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (baseFeatureID) {
				case CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES: return CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (baseFeatureID) {
				case CompositionPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES: return CompositionPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComposedProvidingRequiringEntityImpl
