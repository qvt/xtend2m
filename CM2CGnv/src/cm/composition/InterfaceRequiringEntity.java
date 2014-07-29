/**
 */
package cm.composition;

import cm.repository.RequiredRole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All Entities that require an Interface are represented by this class. Prominent inheriting classes are all component types, for example.
 * Two roles can be identified a software entity can take relative to an interface. Any entity can claim to implement the functionality specified in an interface as well as to request that functionality. This is reflected in the Palladio Component Model by a set of abstract meta-classes giving a conceptual view on interfaces, entities and their relationships. The abstract meta-class InterfaceRequiringEntity is inherited by all entities which are allowed to request functionality offered by entities providing this functionality. Similarly, the meta-classInterfaceProvidingEntity  is inherited by all entities which can potentially offer interface implementations.
 * See also: Interface, RequiredRole
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.InterfaceRequiringEntity#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getInterfaceRequiringEntity()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceRequiringEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.RequiredRole}.
	 * It is bidirectional and its opposite is '{@link cm.repository.RequiredRole#getRequiringEntity <em>Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' containment reference list.
	 * @see cm.composition.CompositionPackage#getInterfaceRequiringEntity_RequiredRoles()
	 * @see cm.repository.RequiredRole#getRequiringEntity
	 * @model opposite="requiringEntity" containment="true" ordered="false"
	 * @generated
	 */
	EList<RequiredRole> getRequiredRoles();

} // InterfaceRequiringEntity
