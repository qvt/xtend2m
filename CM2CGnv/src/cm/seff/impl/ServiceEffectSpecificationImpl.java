/**
 */
package cm.seff.impl;

import cm.repository.BasicComponent;
import cm.repository.RepositoryPackage;
import cm.repository.Signature;

import cm.seff.InternalBehaviour;
import cm.seff.SeffPackage;
import cm.seff.ServiceEffectSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.seff.impl.ServiceEffectSpecificationImpl#getDescribedService <em>Described Service</em>}</li>
 *   <li>{@link cm.seff.impl.ServiceEffectSpecificationImpl#getBasicComponent <em>Basic Component</em>}</li>
 *   <li>{@link cm.seff.impl.ServiceEffectSpecificationImpl#getInternalBehaviours <em>Internal Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceEffectSpecificationImpl extends MinimalEObjectImpl.Container implements ServiceEffectSpecification {
	/**
	 * The cached value of the '{@link #getDescribedService() <em>Described Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedService()
	 * @generated
	 * @ordered
	 */
	protected Signature describedService;

	/**
	 * The cached value of the '{@link #getInternalBehaviours() <em>Internal Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalBehaviour> internalBehaviours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEffectSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getDescribedService() {
		if (describedService != null && describedService.eIsProxy()) {
			InternalEObject oldDescribedService = (InternalEObject)describedService;
			describedService = (Signature)eResolveProxy(oldDescribedService);
			if (describedService != oldDescribedService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE, oldDescribedService, describedService));
			}
		}
		return describedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetDescribedService() {
		return describedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedService(Signature newDescribedService) {
		Signature oldDescribedService = describedService;
		describedService = newDescribedService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE, oldDescribedService, describedService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent getBasicComponent() {
		if (eContainerFeatureID() != SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT) return null;
		return (BasicComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicComponent(BasicComponent newBasicComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBasicComponent, SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicComponent(BasicComponent newBasicComponent) {
		if (newBasicComponent != eInternalContainer() || (eContainerFeatureID() != SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT && newBasicComponent != null)) {
			if (EcoreUtil.isAncestor(this, newBasicComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBasicComponent != null)
				msgs = ((InternalEObject)newBasicComponent).eInverseAdd(this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS, BasicComponent.class, msgs);
			msgs = basicSetBasicComponent(newBasicComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT, newBasicComponent, newBasicComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalBehaviour> getInternalBehaviours() {
		if (internalBehaviours == null) {
			internalBehaviours = new EObjectContainmentWithInverseEList<InternalBehaviour>(InternalBehaviour.class, this, SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS, SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS);
		}
		return internalBehaviours;
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBasicComponent((BasicComponent)otherEnd, msgs);
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalBehaviours()).basicAdd(otherEnd, msgs);
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				return basicSetBasicComponent(null, msgs);
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				return ((InternalEList<?>)getInternalBehaviours()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS, BasicComponent.class, msgs);
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE:
				if (resolve) return getDescribedService();
				return basicGetDescribedService();
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				return getBasicComponent();
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				return getInternalBehaviours();
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE:
				setDescribedService((Signature)newValue);
				return;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				setBasicComponent((BasicComponent)newValue);
				return;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				getInternalBehaviours().clear();
				getInternalBehaviours().addAll((Collection<? extends InternalBehaviour>)newValue);
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE:
				setDescribedService((Signature)null);
				return;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				setBasicComponent((BasicComponent)null);
				return;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				getInternalBehaviours().clear();
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
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE:
				return describedService != null;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT:
				return getBasicComponent() != null;
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS:
				return internalBehaviours != null && !internalBehaviours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceEffectSpecificationImpl
