/**
 */
package cg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cg.AbstractAction#getSources <em>Sources</em>}</li>
 *   <li>{@link cg.AbstractAction#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cg.AbstractAction#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see cg.CgPackage#getAbstractAction()
 * @model
 * @generated
 */
public interface AbstractAction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link cg.Transition}.
	 * It is bidirectional and its opposite is '{@link cg.Transition#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see cg.CgPackage#getAbstractAction_Sources()
	 * @see cg.Transition#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	EList<Transition> getSources();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see cg.CgPackage#getAbstractAction_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link cg.AbstractAction#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link cg.Transition}.
	 * It is bidirectional and its opposite is '{@link cg.Transition#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see cg.CgPackage#getAbstractAction_Targets()
	 * @see cg.Transition#getSources
	 * @model opposite="sources"
	 * @generated
	 */
	EList<Transition> getTargets();

} // AbstractAction
