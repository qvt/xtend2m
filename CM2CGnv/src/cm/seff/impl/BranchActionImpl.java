/**
 */
package cm.seff.impl;

import cm.seff.BranchAction;
import cm.seff.ProbabilisticBranchTransition;
import cm.seff.SeffPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.seff.impl.BranchActionImpl#getBranchTransitions <em>Branch Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchActionImpl extends AbstractActionImpl implements BranchAction {
	/**
	 * The cached value of the '{@link #getBranchTransitions() <em>Branch Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbabilisticBranchTransition> branchTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.BRANCH_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbabilisticBranchTransition> getBranchTransitions() {
		if (branchTransitions == null) {
			branchTransitions = new EObjectContainmentWithInverseEList<ProbabilisticBranchTransition>(ProbabilisticBranchTransition.class, this, SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS, SeffPackage.PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION);
		}
		return branchTransitions;
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchTransitions()).basicAdd(otherEnd, msgs);
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				return ((InternalEList<?>)getBranchTransitions()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				return getBranchTransitions();
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				getBranchTransitions().clear();
				getBranchTransitions().addAll((Collection<? extends ProbabilisticBranchTransition>)newValue);
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				getBranchTransitions().clear();
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
			case SeffPackage.BRANCH_ACTION__BRANCH_TRANSITIONS:
				return branchTransitions != null && !branchTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchActionImpl
