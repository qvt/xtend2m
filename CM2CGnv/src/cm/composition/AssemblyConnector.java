/**
 */
package cm.composition;

import cm.repository.ProvidedRole;
import cm.repository.RequiredRole;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyConnector is a bidirectional link of two assembly contexts. Intuitively, an AssemblyConnector connects a
 * provided and a required interface of two different components. AssemblyContext must refer to the tuple (Role,
 * AssemblyContext) in order to uniquely identify which component roles communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.AssemblyConnector#getRequiringAssemblyContext <em>Requiring Assembly Context</em>}</li>
 *   <li>{@link cm.composition.AssemblyConnector#getProvidingAssemblyContext <em>Providing Assembly Context</em>}</li>
 *   <li>{@link cm.composition.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link cm.composition.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getAssemblyConnector()
 * @model
 * @generated
 */
public interface AssemblyConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Requiring Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiring Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Assembly Context</em>' reference.
	 * @see #setRequiringAssemblyContext(AssemblyContext)
	 * @see cm.composition.CompositionPackage#getAssemblyConnector_RequiringAssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getRequiringAssemblyContext();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyConnector#getRequiringAssemblyContext <em>Requiring Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Assembly Context</em>' reference.
	 * @see #getRequiringAssemblyContext()
	 * @generated
	 */
	void setRequiringAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Providing Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providing Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Assembly Context</em>' reference.
	 * @see #setProvidingAssemblyContext(AssemblyContext)
	 * @see cm.composition.CompositionPackage#getAssemblyConnector_ProvidingAssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getProvidingAssemblyContext();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyConnector#getProvidingAssemblyContext <em>Providing Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Assembly Context</em>' reference.
	 * @see #getProvidingAssemblyContext()
	 * @generated
	 */
	void setProvidingAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(ProvidedRole)
	 * @see cm.composition.CompositionPackage#getAssemblyConnector_ProvidedRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see cm.composition.CompositionPackage#getAssemblyConnector_RequiredRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssemblyConnector references an assembly context and a provided role on the provider side. This constraint ensures that the referenced provided role is really available in the referenced assembly context.
	 * self.providingAssemblyContext.encapsulatedComponent.providedRoles->includes(self.providedRole)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssemblyConnector references an assembly context and a required role on the client side. This constraint ensures that the referenced required role is really available in the referenced assembly context.
	 * self.requiringAssemblyContext.encapsulatedComponent.requiredRoles->includes(self.requiredRole)
	 * The Interfaces references by this Connector must match. This means that either
	 * 1) the referenced providedRole and the referenced requiredRole refer to the same Interface (first part of the expression) or 2)  the Interface A referenced by the providedRole is a subtype of the Interface B referenced by the requiredRole as transitively defined by the parentInterface property. That means that either Interface A is the parentInterface of Interface B, or there is a set of Interfaces
	 * 
	 * self.providedRole.providedInterface = self.requiredRole.requiredInterface
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedInterfacesMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.requiringAssemblyContext.encapsulatedComponent.requiredRoles->includes(self.requiredRole);
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssemblyConnector
