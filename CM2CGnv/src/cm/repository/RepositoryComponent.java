/**
 */
package cm.repository;

import cm.composition.InterfaceProvidingRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract superclass of all component types which can be part of a component repository
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.RepositoryComponent#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getRepositoryComponent()
 * @model abstract="true"
 * @generated
 */
public interface RepositoryComponent extends InterfaceProvidingRequiringEntity {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.Repository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the repository where this entity is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see cm.repository.RepositoryPackage#getRepositoryComponent_Repository()
	 * @see cm.repository.Repository#getComponents
	 * @model opposite="components" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link cm.repository.RepositoryComponent#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // RepositoryComponent
