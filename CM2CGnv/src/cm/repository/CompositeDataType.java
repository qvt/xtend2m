/**
 */
package cm.repository;

import cm.composition.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a complex data type containing other data types. This construct is common in higher programming languages as record, struct, or class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.CompositeDataType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link cm.repository.CompositeDataType#getInnerDeclaration <em>Inner Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends Entity, DataType {
	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference list.
	 * The list contents are of type {@link cm.repository.CompositeDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the parent type in the inheritance hierarchy. Null if there is no parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference list.
	 * @see cm.repository.RepositoryPackage#getCompositeDataType_ParentType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompositeDataType> getParentType();

	/**
	 * Returns the value of the '<em><b>Inner Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.InnerDeclaration}.
	 * It is bidirectional and its opposite is '{@link cm.repository.InnerDeclaration#getCompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the internals, i.e., named items, each of a data type, forming this composite data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Declaration</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getCompositeDataType_InnerDeclaration()
	 * @see cm.repository.InnerDeclaration#getCompositeDataType
	 * @model opposite="compositeDataType" containment="true" ordered="false"
	 * @generated
	 */
	EList<InnerDeclaration> getInnerDeclaration();

} // CompositeDataType
