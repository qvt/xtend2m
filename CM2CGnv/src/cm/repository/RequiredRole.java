/**
 */
package cm.repository;

import cm.composition.InterfaceRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Required roles list the interfaces required by a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.RequiredRole#getRequiringEntity <em>Requiring Entity</em>}</li>
 *   <li>{@link cm.repository.RequiredRole#getRequiredInterface <em>Required Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getRequiredRole()
 * @model
 * @generated
 */
public interface RequiredRole extends Role {
	/**
	 * Returns the value of the '<em><b>Requiring Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.composition.InterfaceRequiringEntity#getRequiredRoles <em>Required Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interface requiring entity that requires this interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requiring Entity</em>' container reference.
	 * @see #setRequiringEntity(InterfaceRequiringEntity)
	 * @see cm.repository.RepositoryPackage#getRequiredRole_RequiringEntity()
	 * @see cm.composition.InterfaceRequiringEntity#getRequiredRoles
	 * @model opposite="requiredRoles" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InterfaceRequiringEntity getRequiringEntity();

	/**
	 * Sets the value of the '{@link cm.repository.RequiredRole#getRequiringEntity <em>Requiring Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Entity</em>' container reference.
	 * @see #getRequiringEntity()
	 * @generated
	 */
	void setRequiringEntity(InterfaceRequiringEntity value);

	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interfaces that is required by this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Interface</em>' reference.
	 * @see #setRequiredInterface(Interface)
	 * @see cm.repository.RepositoryPackage#getRequiredRole_RequiredInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getRequiredInterface();

	/**
	 * Sets the value of the '{@link cm.repository.RequiredRole#getRequiredInterface <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface</em>' reference.
	 * @see #getRequiredInterface()
	 * @generated
	 */
	void setRequiredInterface(Interface value);

} // RequiredRole
