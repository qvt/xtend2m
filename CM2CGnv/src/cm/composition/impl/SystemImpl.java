/**
 */
package cm.composition.impl;

import cm.composition.AssemblyContext;
import cm.composition.ComposedProvidingRequiringEntity;
import cm.composition.ComposedStructure;
import cm.composition.CompositionPackage;
import cm.composition.Connector;
import cm.composition.InterfaceProvidingEntity;
import cm.composition.InterfaceProvidingRequiringEntity;
import cm.composition.InterfaceRequiringEntity;

import cm.composition.util.CompositionValidator;

import cm.repository.ProvidedRole;
import cm.repository.RepositoryPackage;
import cm.repository.RequiredRole;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cm.composition.impl.SystemImpl#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link cm.composition.impl.SystemImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link cm.composition.impl.SystemImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 *   <li>{@link cm.composition.impl.SystemImpl#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EntityImpl implements cm.composition.System {
	/**
	 * The cached value of the '{@link #getAssemblyContexts() <em>Assembly Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblyContexts;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getProvidedRoles() <em>Provided Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssemblyContext> getAssemblyContexts() {
		if (assemblyContexts == null) {
			assemblyContexts = new EObjectContainmentWithInverseEList<AssemblyContext>(AssemblyContext.class, this, CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE);
		}
		return assemblyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, CompositionPackage.SYSTEM__CONNECTORS, CompositionPackage.CONNECTOR__PARENT_STRUCTURE);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedRole> getProvidedRoles() {
		if (providedRoles == null) {
			providedRoles = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, CompositionPackage.SYSTEM__PROVIDED_ROLES, RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY);
		}
		return providedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredRole> getRequiredRoles() {
		if (requiredRoles == null) {
			requiredRoles = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, CompositionPackage.SYSTEM__REQUIRED_ROLES, RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY);
		}
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SystemMustHaveAtLeastOneProvidedRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 CompositionValidator.SYSTEM__SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SystemMustHaveAtLeastOneProvidedRole", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean MultipleConnectorsConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 CompositionValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleConnectorsConstraint", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean MultipleConnectorsConstraintForAssemblyConnectors(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 CompositionValidator.COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleConnectorsConstraintForAssemblyConnectors", EObjectValidator.getObjectLabel(this, context) }),
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssemblyContexts()).basicAdd(otherEnd, msgs);
			case CompositionPackage.SYSTEM__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles()).basicAdd(otherEnd, msgs);
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				return ((InternalEList<?>)getAssemblyContexts()).basicRemove(otherEnd, msgs);
			case CompositionPackage.SYSTEM__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				return ((InternalEList<?>)getProvidedRoles()).basicRemove(otherEnd, msgs);
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				return ((InternalEList<?>)getRequiredRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				return getAssemblyContexts();
			case CompositionPackage.SYSTEM__CONNECTORS:
				return getConnectors();
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				return getProvidedRoles();
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				return getRequiredRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
				getAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case CompositionPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends RequiredRole>)newValue);
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
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
				return;
			case CompositionPackage.SYSTEM__CONNECTORS:
				getConnectors().clear();
				return;
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				getProvidedRoles().clear();
				return;
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				getRequiredRoles().clear();
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
			case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS:
				return assemblyContexts != null && !assemblyContexts.isEmpty();
			case CompositionPackage.SYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case CompositionPackage.SYSTEM__PROVIDED_ROLES:
				return providedRoles != null && !providedRoles.isEmpty();
			case CompositionPackage.SYSTEM__REQUIRED_ROLES:
				return requiredRoles != null && !requiredRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS: return CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS;
				case CompositionPackage.SYSTEM__CONNECTORS: return CompositionPackage.COMPOSED_STRUCTURE__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.SYSTEM__PROVIDED_ROLES: return CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.SYSTEM__REQUIRED_ROLES: return CompositionPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (baseFeatureID) {
				case CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS: return CompositionPackage.SYSTEM__ASSEMBLY_CONTEXTS;
				case CompositionPackage.COMPOSED_STRUCTURE__CONNECTORS: return CompositionPackage.SYSTEM__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (baseFeatureID) {
				case CompositionPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES: return CompositionPackage.SYSTEM__PROVIDED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (baseFeatureID) {
				case CompositionPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES: return CompositionPackage.SYSTEM__REQUIRED_ROLES;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (baseOperationID) {
				case CompositionPackage.COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return CompositionPackage.SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				case CompositionPackage.COMPOSED_STRUCTURE___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP: return CompositionPackage.SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case CompositionPackage.SYSTEM___SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE__DIAGNOSTICCHAIN_MAP:
				return SystemMustHaveAtLeastOneProvidedRole((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CompositionPackage.SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return MultipleConnectorsConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CompositionPackage.SYSTEM___MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__DIAGNOSTICCHAIN_MAP:
				return MultipleConnectorsConstraintForAssemblyConnectors((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl
