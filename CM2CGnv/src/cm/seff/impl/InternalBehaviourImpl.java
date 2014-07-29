/**
 */
package cm.seff.impl;

import cm.seff.AbstractAction;
import cm.seff.InternalBehaviour;
import cm.seff.ProbabilisticBranchTransition;
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
 * An implementation of the model object '<em><b>Internal Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.seff.impl.InternalBehaviourImpl#getServiceEffectSpecifications <em>Service Effect Specifications</em>}</li>
 *   <li>{@link cm.seff.impl.InternalBehaviourImpl#getBranchTransition <em>Branch Transition</em>}</li>
 *   <li>{@link cm.seff.impl.InternalBehaviourImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalBehaviourImpl extends MinimalEObjectImpl.Container implements InternalBehaviour {
	/**
	 * The cached value of the '{@link #getBranchTransition() <em>Branch Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchTransition()
	 * @generated
	 * @ordered
	 */
	protected ProbabilisticBranchTransition branchTransition;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAction> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.INTERNAL_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEffectSpecification getServiceEffectSpecifications() {
		if (eContainerFeatureID() != SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS) return null;
		return (ServiceEffectSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceEffectSpecifications(ServiceEffectSpecification newServiceEffectSpecifications, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceEffectSpecifications, SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceEffectSpecifications(ServiceEffectSpecification newServiceEffectSpecifications) {
		if (newServiceEffectSpecifications != eInternalContainer() || (eContainerFeatureID() != SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS && newServiceEffectSpecifications != null)) {
			if (EcoreUtil.isAncestor(this, newServiceEffectSpecifications))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceEffectSpecifications != null)
				msgs = ((InternalEObject)newServiceEffectSpecifications).eInverseAdd(this, SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS, ServiceEffectSpecification.class, msgs);
			msgs = basicSetServiceEffectSpecifications(newServiceEffectSpecifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS, newServiceEffectSpecifications, newServiceEffectSpecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticBranchTransition getBranchTransition() {
		if (branchTransition != null && branchTransition.eIsProxy()) {
			InternalEObject oldBranchTransition = (InternalEObject)branchTransition;
			branchTransition = (ProbabilisticBranchTransition)eResolveProxy(oldBranchTransition);
			if (branchTransition != oldBranchTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION, oldBranchTransition, branchTransition));
			}
		}
		return branchTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticBranchTransition basicGetBranchTransition() {
		return branchTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchTransition(ProbabilisticBranchTransition newBranchTransition) {
		ProbabilisticBranchTransition oldBranchTransition = branchTransition;
		branchTransition = newBranchTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION, oldBranchTransition, branchTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAction> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, SeffPackage.INTERNAL_BEHAVIOUR__STEPS, SeffPackage.ABSTRACT_ACTION__INTERNAL_BEHAVIOUR);
		}
		return steps;
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServiceEffectSpecifications((ServiceEffectSpecification)otherEnd, msgs);
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				return basicSetServiceEffectSpecifications(null, msgs);
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				return eInternalContainer().eInverseRemove(this, SeffPackage.SERVICE_EFFECT_SPECIFICATION__INTERNAL_BEHAVIOURS, ServiceEffectSpecification.class, msgs);
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				return getServiceEffectSpecifications();
			case SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION:
				if (resolve) return getBranchTransition();
				return basicGetBranchTransition();
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				return getSteps();
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				setServiceEffectSpecifications((ServiceEffectSpecification)newValue);
				return;
			case SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION:
				setBranchTransition((ProbabilisticBranchTransition)newValue);
				return;
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends AbstractAction>)newValue);
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				setServiceEffectSpecifications((ServiceEffectSpecification)null);
				return;
			case SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION:
				setBranchTransition((ProbabilisticBranchTransition)null);
				return;
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				getSteps().clear();
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
			case SeffPackage.INTERNAL_BEHAVIOUR__SERVICE_EFFECT_SPECIFICATIONS:
				return getServiceEffectSpecifications() != null;
			case SeffPackage.INTERNAL_BEHAVIOUR__BRANCH_TRANSITION:
				return branchTransition != null;
			case SeffPackage.INTERNAL_BEHAVIOUR__STEPS:
				return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternalBehaviourImpl
