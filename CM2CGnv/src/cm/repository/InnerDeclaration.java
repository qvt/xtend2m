/**
 */
package cm.repository;

import cm.composition.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represent a declaration of a data type inside of a composite data type. It enriches the data type it declares with a name to allow multiple declarations of the same type within a composite data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.InnerDeclaration#getDataType <em>Data Type</em>}</li>
 *   <li>{@link cm.repository.InnerDeclaration#getCompositeDataType <em>Composite Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getInnerDeclaration()
 * @model
 * @generated
 */
public interface InnerDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the data type that the inner declaration declares.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see cm.repository.RepositoryPackage#getInnerDeclaration_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link cm.repository.InnerDeclaration#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Composite Data Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.CompositeDataType#getInnerDeclaration <em>Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Data Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Data Type</em>' container reference.
	 * @see #setCompositeDataType(CompositeDataType)
	 * @see cm.repository.RepositoryPackage#getInnerDeclaration_CompositeDataType()
	 * @see cm.repository.CompositeDataType#getInnerDeclaration
	 * @model opposite="innerDeclaration" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CompositeDataType getCompositeDataType();

	/**
	 * Sets the value of the '{@link cm.repository.InnerDeclaration#getCompositeDataType <em>Composite Data Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Data Type</em>' container reference.
	 * @see #getCompositeDataType()
	 * @generated
	 */
	void setCompositeDataType(CompositeDataType value);

} // InnerDeclaration
