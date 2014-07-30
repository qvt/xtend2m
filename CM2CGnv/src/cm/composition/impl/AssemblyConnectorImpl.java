/**
 */
package cm.composition.impl;

import cm.composition.AssemblyConnector;
import cm.composition.AssemblyContext;
import cm.composition.CompositionPackage;

import cm.composition.util.CompositionValidator;

import cm.repository.ProvidedRole;
import cm.repository.RequiredRole;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.composition.impl.AssemblyConnectorImpl#getRequiringAssemblyContext <em>Requiring Assembly Context</em>}</li>
 *   <li>{@link cm.composition.impl.AssemblyConnectorImpl#getProvidingAssemblyContext <em>Providing Assembly Context</em>}</li>
 *   <li>{@link cm.composition.impl.AssemblyConnectorImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link cm.composition.impl.AssemblyConnectorImpl#getRequiredRole <em>Required Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends ConnectorImpl implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getRequiringAssemblyContext() <em>Requiring Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext requiringAssemblyContext;

	/**
	 * The cached value of the '{@link #getProvidingAssemblyContext() <em>Providing Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext providingAssemblyContext;

	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole;

	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getRequiringAssemblyContext() {
		if (requiringAssemblyContext != null && requiringAssemblyContext.eIsProxy()) {
			InternalEObject oldRequiringAssemblyContext = (InternalEObject)requiringAssemblyContext;
			requiringAssemblyContext = (AssemblyContext)eResolveProxy(oldRequiringAssemblyContext);
			if (requiringAssemblyContext != oldRequiringAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT, oldRequiringAssemblyContext, requiringAssemblyContext));
			}
		}
		return requiringAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetRequiringAssemblyContext() {
		return requiringAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiringAssemblyContext(AssemblyContext newRequiringAssemblyContext) {
		AssemblyContext oldRequiringAssemblyContext = requiringAssemblyContext;
		requiringAssemblyContext = newRequiringAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT, oldRequiringAssemblyContext, requiringAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getProvidingAssemblyContext() {
		if (providingAssemblyContext != null && providingAssemblyContext.eIsProxy()) {
			InternalEObject oldProvidingAssemblyContext = (InternalEObject)providingAssemblyContext;
			providingAssemblyContext = (AssemblyContext)eResolveProxy(oldProvidingAssemblyContext);
			if (providingAssemblyContext != oldProvidingAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT, oldProvidingAssemblyContext, providingAssemblyContext));
			}
		}
		return providingAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetProvidingAssemblyContext() {
		return providingAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidingAssemblyContext(AssemblyContext newProvidingAssemblyContext) {
		AssemblyContext oldProvidingAssemblyContext = providingAssemblyContext;
		providingAssemblyContext = newProvidingAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT, oldProvidingAssemblyContext, providingAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole() {
		if (providedRole != null && providedRole.eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (ProvidedRole)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(ProvidedRole newProvidedRole) {
		ProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredRole() {
		if (requiredRole != null && requiredRole.eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject)requiredRole;
			requiredRole = (RequiredRole)eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(RequiredRole newRequiredRole) {
		RequiredRole oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, oldRequiredRole, requiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CompositionValidator.DIAGNOSTIC_SOURCE,
						 CompositionValidator.ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssemblyConnectorsReferencedInterfacesMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CompositionValidator.DIAGNOSTIC_SOURCE,
						 CompositionValidator.ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssemblyConnectorsReferencedInterfacesMustMatch", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CompositionValidator.DIAGNOSTIC_SOURCE,
						 CompositionValidator.ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT:
				if (resolve) return getRequiringAssemblyContext();
				return basicGetRequiringAssemblyContext();
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT:
				if (resolve) return getProvidingAssemblyContext();
				return basicGetProvidingAssemblyContext();
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT:
				setRequiringAssemblyContext((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT:
				setProvidingAssemblyContext((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT:
				setRequiringAssemblyContext((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT:
				setProvidingAssemblyContext((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT:
				return requiringAssemblyContext != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT:
				return providingAssemblyContext != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE:
				return providedRole != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE:
				return requiredRole != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP:
				return AssemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__DIAGNOSTICCHAIN_MAP:
				return AssemblyConnectorsReferencedInterfacesMustMatch((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CompositionPackage.ASSEMBLY_CONNECTOR___ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__DIAGNOSTICCHAIN_MAP:
				return AssemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssemblyConnectorImpl
