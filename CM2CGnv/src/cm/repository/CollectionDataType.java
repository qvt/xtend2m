/**
 */
package cm.repository;

import cm.composition.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a collection data type, e.g.,. a list, array, set, of items of the a particular type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.CollectionDataType#getInnerType <em>Inner Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getCollectionDataType()
 * @model
 * @generated
 */
public interface CollectionDataType extends Entity, DataType {
	/**
	 * Returns the value of the '<em><b>Inner Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the type of items contained in the collection data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Type</em>' reference.
	 * @see #setInnerType(DataType)
	 * @see cm.repository.RepositoryPackage#getCollectionDataType_InnerType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getInnerType();

	/**
	 * Sets the value of the '{@link cm.repository.CollectionDataType#getInnerType <em>Inner Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Type</em>' reference.
	 * @see #getInnerType()
	 * @generated
	 */
	void setInnerType(DataType value);

} // CollectionDataType
