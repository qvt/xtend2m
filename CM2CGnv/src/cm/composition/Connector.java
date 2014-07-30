/**
 */
package cm.composition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract superclass for all connectors.
 * TODO: We might want to add a constraint that both sides of the connector must be not null. Then, we don't have to specify that for example for ComposedProvidingRequiringEntities that the ProvidedDelegationConnector actually points to something inner. If you decide not to add a constraint here, then we need a constraint there and maybe at other places -- Anne
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.Connector#getParentStructure <em>Parent Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.composition.ComposedStructure#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(ComposedStructure)
	 * @see cm.composition.CompositionPackage#getConnector_ParentStructure()
	 * @see cm.composition.ComposedStructure#getConnectors
	 * @model opposite="connectors" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ComposedStructure getParentStructure();

	/**
	 * Sets the value of the '{@link cm.composition.Connector#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(ComposedStructure value);

} // Connector
