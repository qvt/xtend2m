/**
 */
package cm.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a data type that can be stored in a repository and used for specification and modeling of interface signatures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.DataType#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.Repository#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the repository to which this data type belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see cm.repository.RepositoryPackage#getDataType_Repository()
	 * @see cm.repository.Repository#getDataTypes
	 * @model opposite="dataTypes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link cm.repository.DataType#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // DataType
