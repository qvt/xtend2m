/**
 */
package cm.seff.impl;

import cm.composition.impl.EntityImpl;

import cm.seff.AbstractAction;
import cm.seff.Automaton;
import cm.seff.BranchAction;
import cm.seff.ProbabilisticBranchTransition;
import cm.seff.SeffPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.seff.impl.ProbabilisticBranchTransitionImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link cm.seff.impl.ProbabilisticBranchTransitionImpl#getBranchAction <em>Branch Action</em>}</li>
 *   <li>{@link cm.seff.impl.ProbabilisticBranchTransitionImpl#getBranchProbability <em>Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbabilisticBranchTransitionImpl extends EntityImpl implements ProbabilisticBranchTransition {
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
	 * The default value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double BRANCH_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProbability()
	 * @generated
	 * @ordered
	 */
	protected double branchProbability = BRANCH_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticBranchTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.PROBABILISTIC_BRANCH_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAction> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS, SeffPackage.ABSTRACT_ACTION__SPECIFICATION);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchAction getBranchAction() {
		if (eContainerFeatureID() != SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION) return null;
		return (BranchAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchAction(BranchAction newBranchAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranchAction, SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchAction(BranchAction newBranchAction) {
		if (newBranchAction != eInternalContainer() || (eContainerFeatureID() != SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION && newBranchAction != null)) {
			if (EcoreUtil.isAncestor(this, newBranchAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranchAction != null)
				msgs = ((InternalEObject)newBranchAction).eInverseAdd(this, SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS, BranchAction.class, msgs);
			msgs = basicSetBranchAction(newBranchAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION, newBranchAction, newBranchAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBranchProbability() {
		return branchProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchProbability(double newBranchProbability) {
		double oldBranchProbability = branchProbability;
		branchProbability = newBranchProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY, oldBranchProbability, branchProbability));
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranchAction((BranchAction)otherEnd, msgs);
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				return basicSetBranchAction(null, msgs);
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				return eInternalContainer().eInverseRemove(this, SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS, BranchAction.class, msgs);
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				return getSteps();
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				return getBranchAction();
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
				return getBranchProbability();
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends AbstractAction>)newValue);
				return;
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				setBranchAction((BranchAction)newValue);
				return;
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
				setBranchProbability((Double)newValue);
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				getSteps().clear();
				return;
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				setBranchAction((BranchAction)null);
				return;
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
				setBranchProbability(BRANCH_PROBABILITY_EDEFAULT);
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
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS:
				return steps != null && !steps.isEmpty();
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION:
				return getBranchAction() != null;
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY:
				return branchProbability != BRANCH_PROBABILITY_EDEFAULT;
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
		if (baseClass == Automaton.class) {
			switch (derivedFeatureID) {
				case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS: return SeffPackage.AUTOMATON__STEPS;
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
		if (baseClass == Automaton.class) {
			switch (baseFeatureID) {
				case SeffPackage.AUTOMATON__STEPS: return SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__STEPS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (branchProbability: ");
		result.append(branchProbability);
		result.append(')');
		return result.toString();
	}

} //ProbabilisticBranchTransitionImpl
