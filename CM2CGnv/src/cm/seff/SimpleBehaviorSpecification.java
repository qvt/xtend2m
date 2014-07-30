/**
 */
package cm.seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.SimpleBehaviorSpecification#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getSimpleBehaviorSpecification()
 * @model
 * @generated
 */
public interface SimpleBehaviorSpecification extends ServiceEffectSpecification, Automaton {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(ProbabilisticBranchTransition)
	 * @see cm.seff.SeffPackage#getSimpleBehaviorSpecification_Transition()
	 * @model
	 * @generated
	 */
	ProbabilisticBranchTransition getTransition();

	/**
	 * Sets the value of the '{@link cm.seff.SimpleBehaviorSpecification#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(ProbabilisticBranchTransition value);

} // SimpleBehaviorSpecification
