/**
 */
package cm.seff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models the behavior of a component service as a sequence of control flow constructs, and external calls. Therefore, the class contains a chain of AbstractActions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.InternalBehaviour#getServiceEffectSpecifications <em>Service Effect Specifications</em>}</li>
 *   <li>{@link cm.seff.InternalBehaviour#getBranchTransition <em>Branch Transition</em>}</li>
 *   <li>{@link cm.seff.InternalBehaviour#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getInternalBehaviour()
 * @model
 * @generated
 */
public interface InternalBehaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Effect Specifications</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.ServiceEffectSpecification#getInternalBehaviours <em>Internal Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Effect Specifications</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Effect Specifications</em>' container reference.
	 * @see #setServiceEffectSpecifications(ServiceEffectSpecification)
	 * @see cm.seff.SeffPackage#getInternalBehaviour_ServiceEffectSpecifications()
	 * @see cm.seff.ServiceEffectSpecification#getInternalBehaviours
	 * @model opposite="internalBehaviours" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ServiceEffectSpecification getServiceEffectSpecifications();

	/**
	 * Sets the value of the '{@link cm.seff.InternalBehaviour#getServiceEffectSpecifications <em>Service Effect Specifications</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Effect Specifications</em>' container reference.
	 * @see #getServiceEffectSpecifications()
	 * @generated
	 */
	void setServiceEffectSpecifications(ServiceEffectSpecification value);

	/**
	 * Returns the value of the '<em><b>Branch Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Transition</em>' reference.
	 * @see #setBranchTransition(ProbabilisticBranchTransition)
	 * @see cm.seff.SeffPackage#getInternalBehaviour_BranchTransition()
	 * @model ordered="false"
	 * @generated
	 */
	ProbabilisticBranchTransition getBranchTransition();

	/**
	 * Sets the value of the '{@link cm.seff.InternalBehaviour#getBranchTransition <em>Branch Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Transition</em>' reference.
	 * @see #getBranchTransition()
	 * @generated
	 */
	void setBranchTransition(ProbabilisticBranchTransition value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link cm.seff.AbstractAction}.
	 * It is bidirectional and its opposite is '{@link cm.seff.AbstractAction#getInternalBehaviour <em>Internal Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see cm.seff.SeffPackage#getInternalBehaviour_Steps()
	 * @see cm.seff.AbstractAction#getInternalBehaviour
	 * @model opposite="internalBehaviour" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractAction> getSteps();

} // InternalBehaviour
