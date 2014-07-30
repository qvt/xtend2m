/**
 */
package cm.composition;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO/FIXME: The distinction between ComposedStructure and ComposedProvidingRequiringStructure does not make sense at the moment, because the ComposedStructure already talks about inner provided / required delegation connectors, which only make sense if there are outer roles for interfaces -> ComposedProvidingRequiringStructure. IDEA: Move the delegation connector attributes to ComposedProvidingRequiringStructure. I'm not sure about the assembly connectors. SEE ALSO: ComposedProvidingRequiringStructure
 * However, as AssemblyContexts of ComposedStructure always contain InterfaceProvidingRequiringEntities at the moment, the above might not help... -- Anne
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.ComposedStructure#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 *   <li>{@link cm.composition.ComposedStructure#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getComposedStructure()
 * @model abstract="true"
 * @generated
 */
public interface ComposedStructure extends Entity {
	/**
	 * Returns the value of the '<em><b>Assembly Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link cm.composition.AssemblyContext}.
	 * It is bidirectional and its opposite is '{@link cm.composition.AssemblyContext#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Contexts</em>' containment reference list.
	 * @see cm.composition.CompositionPackage#getComposedStructure_AssemblyContexts()
	 * @see cm.composition.AssemblyContext#getParentStructure
	 * @model opposite="parentStructure" containment="true" ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link cm.composition.Connector}.
	 * It is bidirectional and its opposite is '{@link cm.composition.Connector#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see cm.composition.CompositionPackage#getComposedStructure_Connectors()
	 * @see cm.composition.Connector#getParentStructure
	 * @model opposite="parentStructure" containment="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.connectors->select(conn : <<NullPointerException>> | conn.oclIsTypeOf(<<NullPointerException>>)).oclAsType(<<NullPointerException>>)->forAll(c1 : <<NullPointerException>>, c2 : <<NullPointerException>> | c1 <> c2 implies c1.outerProvidedRole <> c2.outerProvidedRole);
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean MultipleConnectorsConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.connectors->select(conn : <<NullPointerException>> | conn.oclIsTypeOf(<<NullPointerException>>)).oclAsType(<<NullPointerException>>)->forAll(c1 : <<NullPointerException>>, c2 : <<NullPointerException>> | c1 <> c2 and c1.requiringAssemblyContext = c2.requiringAssemblyContext implies c1.requiredRole <> c2.requiredRole);
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean MultipleConnectorsConstraintForAssemblyConnectors(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComposedStructure
