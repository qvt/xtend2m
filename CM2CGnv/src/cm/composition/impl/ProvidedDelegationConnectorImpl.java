/**
 */
package cm.composition.impl;

import cm.composition.AssemblyContext;
import cm.composition.CompositionPackage;
import cm.composition.ProvidedDelegationConnector;

import cm.composition.util.CompositionValidator;

import cm.repository.ProvidedRole;

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
 * An implementation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.composition.impl.ProvidedDelegationConnectorImpl#getInnerProvidedRole <em>Inner Provided Role</em>}</li>
 *   <li>{@link cm.composition.impl.ProvidedDelegationConnectorImpl#getOuterProvidedRole <em>Outer Provided Role</em>}</li>
 *   <li>{@link cm.composition.impl.ProvidedDelegationConnectorImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedDelegationConnectorImpl extends DelegationConnectorImpl implements ProvidedDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerProvidedRole() <em>Inner Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole innerProvidedRole;

	/**
	 * The cached value of the '{@link #getOuterProvidedRole() <em>Outer Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole outerProvidedRole;

	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.PROVIDED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getInnerProvidedRole() {
		if (innerProvidedRole != null && innerProvidedRole.eIsProxy()) {
			InternalEObject oldInnerProvidedRole = (InternalEObject)innerProvidedRole;
			innerProvidedRole = (ProvidedRole)eResolveProxy(oldInnerProvidedRole);
			if (innerProvidedRole != oldInnerProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE, oldInnerProvidedRole, innerProvidedRole));
			}
		}
		return innerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetInnerProvidedRole() {
		return innerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerProvidedRole(ProvidedRole newInnerProvidedRole) {
		ProvidedRole oldInnerProvidedRole = innerProvidedRole;
		innerProvidedRole = newInnerProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE, oldInnerProvidedRole, innerProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getOuterProvidedRole() {
		if (outerProvidedRole != null && outerProvidedRole.eIsProxy()) {
			InternalEObject oldOuterProvidedRole = (InternalEObject)outerProvidedRole;
			outerProvidedRole = (ProvidedRole)eResolveProxy(oldOuterProvidedRole);
			if (outerProvidedRole != oldOuterProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE, oldOuterProvidedRole, outerProvidedRole));
			}
		}
		return outerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetOuterProvidedRole() {
		return outerProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterProvidedRole(ProvidedRole newOuterProvidedRole) {
		ProvidedRole oldOuterProvidedRole = outerProvidedRole;
		outerProvidedRole = newOuterProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE, oldOuterProvidedRole, outerProvidedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		if (assemblyContext != null && assemblyContext.eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject)assemblyContext;
			assemblyContext = (AssemblyContext)eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		AssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 CompositionValidator.PROVIDED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 CompositionValidator.PROVIDED_DELEGATION_CONNECTOR__PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", EObjectValidator.getObjectLabel(this, context) }),
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				if (resolve) return getInnerProvidedRole();
				return basicGetInnerProvidedRole();
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				if (resolve) return getOuterProvidedRole();
				return basicGetOuterProvidedRole();
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				setInnerProvidedRole((ProvidedRole)newValue);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				setOuterProvidedRole((ProvidedRole)newValue);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				setInnerProvidedRole((ProvidedRole)null);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				setOuterProvidedRole((ProvidedRole)null);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE:
				return innerProvidedRole != null;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE:
				return outerProvidedRole != null;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT:
				return assemblyContext != null;
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR___COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME__DIAGNOSTICCHAIN_MAP:
				return ComponentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR___PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__DIAGNOSTICCHAIN_MAP:
				return ProvidedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProvidedDelegationConnectorImpl
