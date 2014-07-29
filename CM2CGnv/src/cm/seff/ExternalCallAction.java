/**
 */
package cm.seff;

import cm.repository.RequiredRole;
import cm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ExternalCallAction models the invocation of a service specified in a required interface. Therefore, it references a Role, from which the providing component can be derived, and a Signature to specify the called service. ExternalCallActions model synchronous calls to required services, i.e., the caller waits until the called service finishes execution before continuing execution itself.
 * In this simpler component model, ExternalCallActions may not contain any VariableUsages specifying input parameter characterizations and output parameter characterizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.ExternalCallAction#getCalledService <em>Called Service</em>}</li>
 *   <li>{@link cm.seff.ExternalCallAction#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getExternalCallAction()
 * @model
 * @generated
 */
public interface ExternalCallAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Called Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Service</em>' reference.
	 * @see #setCalledService(Signature)
	 * @see cm.seff.SeffPackage#getExternalCallAction_CalledService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getCalledService();

	/**
	 * Sets the value of the '{@link cm.seff.ExternalCallAction#getCalledService <em>Called Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Service</em>' reference.
	 * @see #getCalledService()
	 * @generated
	 */
	void setCalledService(Signature value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(RequiredRole)
	 * @see cm.seff.SeffPackage#getExternalCallAction_Role()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequiredRole getRole();

	/**
	 * Sets the value of the '{@link cm.seff.ExternalCallAction#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RequiredRole value);

} // ExternalCallAction
