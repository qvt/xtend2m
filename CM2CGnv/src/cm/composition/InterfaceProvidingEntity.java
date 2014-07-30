/**
 */
package cm.composition;

import cm.repository.ProvidedRole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.InterfaceProvidingEntity#getProvidedRoles <em>Provided Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getInterfaceProvidingEntity()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceProvidingEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.ProvidedRole}.
	 * It is bidirectional and its opposite is '{@link cm.repository.ProvidedRole#getProvidingEntity <em>Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' containment reference list.
	 * @see cm.composition.CompositionPackage#getInterfaceProvidingEntity_ProvidedRoles()
	 * @see cm.repository.ProvidedRole#getProvidingEntity
	 * @model opposite="providingEntity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProvidedRole> getProvidedRoles();

} // InterfaceProvidingEntity
