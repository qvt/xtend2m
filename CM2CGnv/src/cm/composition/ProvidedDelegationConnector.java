/**
 */
package cm.composition;

import cm.repository.ProvidedRole;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProvidedDelegationConnector delegates incoming calls of provided roles to inner provided roles of encapsulated assembly contexts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}</li>
 *   <li>{@link cm.composition.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}</li>
 *   <li>{@link cm.composition.ProvidedDelegationConnector#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getProvidedDelegationConnector()
 * @model
 * @generated
 */
public interface ProvidedDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Provided Role</em>' reference.
	 * @see #setInnerProvidedRole(ProvidedRole)
	 * @see cm.composition.CompositionPackage#getProvidedDelegationConnector_InnerProvidedRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProvidedRole getInnerProvidedRole();

	/**
	 * Sets the value of the '{@link cm.composition.ProvidedDelegationConnector#getInnerProvidedRole <em>Inner Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Provided Role</em>' reference.
	 * @see #getInnerProvidedRole()
	 * @generated
	 */
	void setInnerProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Outer Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Provided Role</em>' reference.
	 * @see #setOuterProvidedRole(ProvidedRole)
	 * @see cm.composition.CompositionPackage#getProvidedDelegationConnector_OuterProvidedRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProvidedRole getOuterProvidedRole();

	/**
	 * Sets the value of the '{@link cm.composition.ProvidedDelegationConnector#getOuterProvidedRole <em>Outer Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Provided Role</em>' reference.
	 * @see #getOuterProvidedRole()
	 * @generated
	 */
	void setOuterProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see cm.composition.CompositionPackage#getProvidedDelegationConnector_AssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link cm.composition.ProvidedDelegationConnector#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.innerProvidedRole.providingEntity = self.assemblyContext.encapsulatedComponent;
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.parentStructure = self.assemblyContext.parentStructure;
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProvidedDelegationConnector
