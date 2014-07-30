/**
 */
package cm.repository.impl;

import cm.composition.CompositionPackage;
import cm.composition.InterfaceProvidingEntity;

import cm.repository.Interface;
import cm.repository.ProvidedRole;
import cm.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.repository.impl.ProvidedRoleImpl#getProvidingEntity <em>Providing Entity</em>}</li>
 *   <li>{@link cm.repository.impl.ProvidedRoleImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedRoleImpl extends RoleImpl implements ProvidedRole {
	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface providedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.PROVIDED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceProvidingEntity getProvidingEntity() {
		if (eContainerFeatureID() != RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY) return null;
		return (InterfaceProvidingEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidingEntity(InterfaceProvidingEntity newProvidingEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProvidingEntity, RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidingEntity(InterfaceProvidingEntity newProvidingEntity) {
		if (newProvidingEntity != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY && newProvidingEntity != null)) {
			if (EcoreUtil.isAncestor(this, newProvidingEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProvidingEntity != null)
				msgs = ((InternalEObject)newProvidingEntity).eInverseAdd(this, CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES, InterfaceProvidingEntity.class, msgs);
			msgs = basicSetProvidingEntity(newProvidingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY, newProvidingEntity, newProvidingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getProvidedInterface() {
		if (providedInterface != null && providedInterface.eIsProxy()) {
			InternalEObject oldProvidedInterface = (InternalEObject)providedInterface;
			providedInterface = (Interface)eResolveProxy(oldProvidedInterface);
			if (providedInterface != oldProvidedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
			}
		}
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetProvidedInterface() {
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedInterface(Interface newProvidedInterface) {
		Interface oldProvidedInterface = providedInterface;
		providedInterface = newProvidedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProvidingEntity((InterfaceProvidingEntity)otherEnd, msgs);
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
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				return basicSetProvidingEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				return eInternalContainer().eInverseRemove(this, CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES, InterfaceProvidingEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				return getProvidingEntity();
			case RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE:
				if (resolve) return getProvidedInterface();
				return basicGetProvidedInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				setProvidingEntity((InterfaceProvidingEntity)newValue);
				return;
			case RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE:
				setProvidedInterface((Interface)newValue);
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
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				setProvidingEntity((InterfaceProvidingEntity)null);
				return;
			case RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE:
				setProvidedInterface((Interface)null);
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
			case RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY:
				return getProvidingEntity() != null;
			case RepositoryPackage.PROVIDED_ROLE__PROVIDED_INTERFACE:
				return providedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedRoleImpl
