/**
 */
package cm.composition;

import cm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RequiredDelegationConnector delegates required roles of encapsulated assembly contexts to outer required roles
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}</li>
 *   <li>{@link cm.composition.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}</li>
 *   <li>{@link cm.composition.RequiredDelegationConnector#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getRequiredDelegationConnector()
 * @model
 * @generated
 */
public interface RequiredDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Required Role</em>' reference.
	 * @see #setInnerRequiredRole(RequiredRole)
	 * @see cm.composition.CompositionPackage#getRequiredDelegationConnector_InnerRequiredRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequiredRole getInnerRequiredRole();

	/**
	 * Sets the value of the '{@link cm.composition.RequiredDelegationConnector#getInnerRequiredRole <em>Inner Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Required Role</em>' reference.
	 * @see #getInnerRequiredRole()
	 * @generated
	 */
	void setInnerRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Outer Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Required Role</em>' reference.
	 * @see #setOuterRequiredRole(RequiredRole)
	 * @see cm.composition.CompositionPackage#getRequiredDelegationConnector_OuterRequiredRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequiredRole getOuterRequiredRole();

	/**
	 * Sets the value of the '{@link cm.composition.RequiredDelegationConnector#getOuterRequiredRole <em>Outer Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Required Role</em>' reference.
	 * @see #getOuterRequiredRole()
	 * @generated
	 */
	void setOuterRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see cm.composition.CompositionPackage#getRequiredDelegationConnector_AssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link cm.composition.RequiredDelegationConnector#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // RequiredDelegationConnector
