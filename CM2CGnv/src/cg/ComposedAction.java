/**
 */
package cg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cg.ComposedAction#getNet <em>Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see cg.CgPackage#getComposedAction()
 * @model
 * @generated
 */
public interface ComposedAction extends Action {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Graph)
	 * @see cg.CgPackage#getComposedAction_Net()
	 * @model required="true"
	 * @generated
	 */
	Graph getNet();

	/**
	 * Sets the value of the '{@link cg.ComposedAction#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Graph value);

} // ComposedAction
