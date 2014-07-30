/**
 */
package cm.repository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a parameter within a signature. The parameter has a name and it is of a data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.Parameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link cm.repository.Parameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link cm.repository.Parameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the data type of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see cm.repository.RepositoryPackage#getParameter_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link cm.repository.Parameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property navigates to the signature this parameter is a part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(Signature)
	 * @see cm.repository.RepositoryPackage#getParameter_Signature()
	 * @see cm.repository.Signature#getParameters
	 * @model opposite="parameters" transient="false" ordered="false"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link cm.repository.Parameter#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property holds the name of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cm.repository.RepositoryPackage#getParameter_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cm.repository.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Parameter
