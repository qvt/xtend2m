/**
 */
package cm.seff;

import cm.composition.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models the behavior of a component service as a sequence of control flow constructs and external calls.
 * Therefore, the class contains a chain of AbstractActions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.AbstractAction#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link cm.seff.AbstractAction#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link cm.seff.AbstractAction#getInternalBehaviour <em>Internal Behaviour</em>}</li>
 *   <li>{@link cm.seff.AbstractAction#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getAbstractAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAction extends Entity {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.AbstractAction#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(AbstractAction)
	 * @see cm.seff.SeffPackage#getAbstractAction_Predecessor()
	 * @see cm.seff.AbstractAction#getSuccessor
	 * @model opposite="successor" ordered="false"
	 * @generated
	 */
	AbstractAction getPredecessor();

	/**
	 * Sets the value of the '{@link cm.seff.AbstractAction#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(AbstractAction value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.AbstractAction#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(AbstractAction)
	 * @see cm.seff.SeffPackage#getAbstractAction_Successor()
	 * @see cm.seff.AbstractAction#getPredecessor
	 * @model opposite="predecessor" ordered="false"
	 * @generated
	 */
	AbstractAction getSuccessor();

	/**
	 * Sets the value of the '{@link cm.seff.AbstractAction#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(AbstractAction value);

	/**
	 * Returns the value of the '<em><b>Internal Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.InternalBehaviour#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Behaviour</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Behaviour</em>' container reference.
	 * @see #setInternalBehaviour(InternalBehaviour)
	 * @see cm.seff.SeffPackage#getAbstractAction_InternalBehaviour()
	 * @see cm.seff.InternalBehaviour#getSteps
	 * @model opposite="steps" transient="false" ordered="false"
	 * @generated
	 */
	InternalBehaviour getInternalBehaviour();

	/**
	 * Sets the value of the '{@link cm.seff.AbstractAction#getInternalBehaviour <em>Internal Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Behaviour</em>' container reference.
	 * @see #getInternalBehaviour()
	 * @generated
	 */
	void setInternalBehaviour(InternalBehaviour value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.seff.Automaton#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(Automaton)
	 * @see cm.seff.SeffPackage#getAbstractAction_Specification()
	 * @see cm.seff.Automaton#getSteps
	 * @model opposite="steps" transient="false"
	 * @generated
	 */
	Automaton getSpecification();

	/**
	 * Sets the value of the '{@link cm.seff.AbstractAction#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Automaton value);

} // AbstractAction
