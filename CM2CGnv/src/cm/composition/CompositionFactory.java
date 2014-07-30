/**
 */
package cm.composition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cm.composition.CompositionPackage
 * @generated
 */
public interface CompositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionFactory eINSTANCE = cm.composition.impl.CompositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Delegation Connector</em>'.
	 * @generated
	 */
	ProvidedDelegationConnector createProvidedDelegationConnector();

	/**
	 * Returns a new object of class '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Delegation Connector</em>'.
	 * @generated
	 */
	RequiredDelegationConnector createRequiredDelegationConnector();

	/**
	 * Returns a new object of class '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Connector</em>'.
	 * @generated
	 */
	AssemblyConnector createAssemblyConnector();

	/**
	 * Returns a new object of class '<em>Assembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Context</em>'.
	 * @generated
	 */
	AssemblyContext createAssemblyContext();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub System</em>'.
	 * @generated
	 */
	SubSystem createSubSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompositionPackage getCompositionPackage();

} //CompositionFactory
