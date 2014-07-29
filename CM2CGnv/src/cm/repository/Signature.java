/**
 */
package cm.repository;

import cm.composition.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents the signature of a method, i.e., its parameters, exception declarations, return type, etc.
 * Every service of an interface has a unique signature, like void doSomething(int a). A PCM signature is comparable to a method signature in programming languages like C#, Java or the OMG IDL.
 * It contains:
 *  * A type of the return value or void (no return value),
 *  * an identifier naming the service,
 *  * an ordered set of parameters (0..*).Each parameter is a tuple of a datatype and an identifier (which is unique across the parameters). Additionally, the modifiers in, out, and inout (with its OMG
 *  * IDL semantics) can be used for parameters, and
 *  * an unordered set of exceptions.
 * A signature has to be unique for an interface through the tupel (identifier, order of parameters). An interface has a list of 1..* signatures (interfaces associate 1..* signatures, not the other way around). A
 * signature is assigned to exactly one interface. However, different interfaces can define equally named signatures. If, for example, void doIt() is defined for interface A and B, void doIt() is not identical in both interfaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.Signature#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link cm.repository.Signature#getParameters <em>Parameters</em>}</li>
 *   <li>{@link cm.repository.Signature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link cm.repository.Signature#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends Entity {
	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.ExceptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of exceptions declared by this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getSignature_Exceptions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExceptionType> getExceptions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link cm.repository.Parameter}.
	 * It is bidirectional and its opposite is '{@link cm.repository.Parameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of parameters of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getSignature_Parameters()
	 * @see cm.repository.Parameter#getSignature
	 * @model opposite="signature" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the return type of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(DataType)
	 * @see cm.repository.RepositoryPackage#getSignature_ReturnType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link cm.repository.Signature#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.Interface#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interface that contains the method with this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see cm.repository.RepositoryPackage#getSignature_Interface()
	 * @see cm.repository.Interface#getSignatures
	 * @model opposite="signatures" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link cm.repository.Signature#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Signature
