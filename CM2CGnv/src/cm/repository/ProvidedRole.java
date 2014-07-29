/**
 */
package cm.repository;

import cm.composition.InterfaceProvidingEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provided roles list the interfaces offered by a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.ProvidedRole#getProvidingEntity <em>Providing Entity</em>}</li>
 *   <li>{@link cm.repository.ProvidedRole#getProvidedInterface <em>Provided Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getProvidedRole()
 * @model
 * @generated
 */
public interface ProvidedRole extends Role {
	/**
	 * Returns the value of the '<em><b>Providing Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.composition.InterfaceProvidingEntity#getProvidedRoles <em>Provided Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the providing entity that is providing the interface associated with this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Providing Entity</em>' container reference.
	 * @see #setProvidingEntity(InterfaceProvidingEntity)
	 * @see cm.repository.RepositoryPackage#getProvidedRole_ProvidingEntity()
	 * @see cm.composition.InterfaceProvidingEntity#getProvidedRoles
	 * @model opposite="providedRoles" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InterfaceProvidingEntity getProvidingEntity();

	/**
	 * Sets the value of the '{@link cm.repository.ProvidedRole#getProvidingEntity <em>Providing Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Entity</em>' container reference.
	 * @see #getProvidingEntity()
	 * @generated
	 */
	void setProvidingEntity(InterfaceProvidingEntity value);

	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the corresponding interface that is provided by this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Interface</em>' reference.
	 * @see #setProvidedInterface(Interface)
	 * @see cm.repository.RepositoryPackage#getProvidedRole_ProvidedInterface()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getProvidedInterface();

	/**
	 * Sets the value of the '{@link cm.repository.ProvidedRole#getProvidedInterface <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(Interface value);

} // ProvidedRole
