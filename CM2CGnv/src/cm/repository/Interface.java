/**
 */
package cm.repository;

import cm.composition.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity models the interface as a set of signatures representing services provided or required by a component. An interface is an abstraction of piece of software (a software entity) which should contain a sufficient amount of information for a caller to understand and finally request the realised functionality from any entity claiming to offer the specified functionality. Note that this implies, that the specification of the interface also has to contain a sufficient amount of information for the implementer to actually implement the interface. Due to the inherent need of an interface to abstract the behaviour of the software entity not in all cases there is sufficient information provided to use or implement an interface in an unambiquious way.
 * Interfaces can exist on their own, i.e., without any entity requesting or implementing the specified functionality. Two roles can be identified a software entity can take relative to an interface. Any entity can either claim to implement the functionality specified in an interface or to request that functionality. This is reflected in the Palladio Component Model by a set of abstract meta-classes giving a conceptual view on interfaces, entities, and their relationships.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.Interface#getParentInterfaces <em>Parent Interfaces</em>}</li>
 *   <li>{@link cm.repository.Interface#getRepository <em>Repository</em>}</li>
 *   <li>{@link cm.repository.Interface#getSignatures <em>Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Interfaces</b></em>' reference list.
	 * The list contents are of type {@link cm.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interfaces from which this interface directly inherits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Interfaces</em>' reference list.
	 * @see cm.repository.RepositoryPackage#getInterface_ParentInterfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getParentInterfaces();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.Repository#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the repository where this interface is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see cm.repository.RepositoryPackage#getInterface_Repository()
	 * @see cm.repository.Repository#getInterfaces
	 * @model opposite="interfaces" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link cm.repository.Interface#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.Signature}.
	 * It is bidirectional and its opposite is '{@link cm.repository.Signature#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the set of signatures of which the interface consists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getInterface_Signatures()
	 * @see cm.repository.Signature#getInterface
	 * @model opposite="interface" containment="true" ordered="false"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Interface
