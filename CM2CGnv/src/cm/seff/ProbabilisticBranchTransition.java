/**
 */
package cm.seff;

import cm.composition.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Branch splits the user flow with a XOR-semantic: one of the included BranchTransitions
 * is taken depending on the specified branch probabilities. Each BranchTransition contains a
 * nested InternalBehaviour, which executes once this branch transition is chosen. After
 * execution of the complete nested InternalBehaviour, the next action in the user flow after the
 * Branch is its successor action.
 * 
 * A constraint ensures that all branchProbabilities of the included BranchTransitions sum up to 1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.ProbabilisticBranchTransition#getBranchAction <em>Branch Action</em>}</li>
 *   <li>{@link cm.seff.ProbabilisticBranchTransition#getBranchProbability <em>Branch Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getProbabilisticBranchTransition()
 * @model
 * @generated
 */
public interface ProbabilisticBranchTransition extends Entity, Automaton {
	/**
	 * Returns the value of the '<em><b>Branch Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.BranchAction#getBranchTransitions <em>Branch Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Action</em>' container reference.
	 * @see #setBranchAction(BranchAction)
	 * @see cm.seff.SeffPackage#getProbabilisticBranchTransition_BranchAction()
	 * @see cm.seff.BranchAction#getBranchTransitions
	 * @model opposite="branchTransitions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BranchAction getBranchAction();

	/**
	 * Sets the value of the '{@link cm.seff.ProbabilisticBranchTransition#getBranchAction <em>Branch Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Action</em>' container reference.
	 * @see #getBranchAction()
	 * @generated
	 */
	void setBranchAction(BranchAction value);

	/**
	 * Returns the value of the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Probability</em>' attribute.
	 * @see #setBranchProbability(double)
	 * @see cm.seff.SeffPackage#getProbabilisticBranchTransition_BranchProbability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getBranchProbability();

	/**
	 * Sets the value of the '{@link cm.seff.ProbabilisticBranchTransition#getBranchProbability <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Probability</em>' attribute.
	 * @see #getBranchProbability()
	 * @generated
	 */
	void setBranchProbability(double value);

} // ProbabilisticBranchTransition
