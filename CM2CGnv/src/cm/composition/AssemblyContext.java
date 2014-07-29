/**
 */
package cm.composition;

import cm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.composition.AssemblyContext#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link cm.composition.AssemblyContext#getEncapsulatedComponent <em>Encapsulated Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.composition.CompositionPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.composition.ComposedStructure#getAssemblyContexts <em>Assembly Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(ComposedStructure)
	 * @see cm.composition.CompositionPackage#getAssemblyContext_ParentStructure()
	 * @see cm.composition.ComposedStructure#getAssemblyContexts
	 * @model opposite="assemblyContexts" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ComposedStructure getParentStructure();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyContext#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(ComposedStructure value);

	/**
	 * Returns the value of the '<em><b>Encapsulated Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulated Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Component</em>' reference.
	 * @see #setEncapsulatedComponent(RepositoryComponent)
	 * @see cm.composition.CompositionPackage#getAssemblyContext_EncapsulatedComponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RepositoryComponent getEncapsulatedComponent();

	/**
	 * Sets the value of the '{@link cm.composition.AssemblyContext#getEncapsulatedComponent <em>Encapsulated Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Component</em>' reference.
	 * @see #getEncapsulatedComponent()
	 * @generated
	 */
	void setEncapsulatedComponent(RepositoryComponent value);

} // AssemblyContext
