/**
 */
package cm.repository;

import cm.composition.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The repository entity allows storing components, data types, and interfaces to be fetched and reused for construction of component instances as well as new component types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.Repository#getDescription <em>Description</em>}</li>
 *   <li>{@link cm.repository.Repository#getComponents <em>Components</em>}</li>
 *   <li>{@link cm.repository.Repository#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link cm.repository.Repository#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Entity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents a description of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cm.repository.RepositoryPackage#getRepository_Description()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cm.repository.Repository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.RepositoryComponent}.
	 * It is bidirectional and its opposite is '{@link cm.repository.RepositoryComponent#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the provides component types stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getRepository_Components()
	 * @see cm.repository.RepositoryComponent#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 * @generated
	 */
	EList<RepositoryComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.Interface}.
	 * It is bidirectional and its opposite is '{@link cm.repository.Interface#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interfaces stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getRepository_Interfaces()
	 * @see cm.repository.Interface#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.DataType}.
	 * It is bidirectional and its opposite is '{@link cm.repository.DataType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the data types stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getRepository_DataTypes()
	 * @see cm.repository.DataType#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // Repository
