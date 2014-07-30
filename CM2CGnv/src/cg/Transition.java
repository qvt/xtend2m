/**
 */
package cg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cg.Transition#getSources <em>Sources</em>}</li>
 *   <li>{@link cg.Transition#getTargets <em>Targets</em>}</li>
 *   <li>{@link cg.Transition#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see cg.CgPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link cg.AbstractAction}.
	 * It is bidirectional and its opposite is '{@link cg.AbstractAction#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see cg.CgPackage#getTransition_Sources()
	 * @see cg.AbstractAction#getTargets
	 * @model opposite="targets" required="true"
	 * @generated
	 */
	EList<AbstractAction> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link cg.AbstractAction}.
	 * It is bidirectional and its opposite is '{@link cg.AbstractAction#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see cg.CgPackage#getTransition_Targets()
	 * @see cg.AbstractAction#getSources
	 * @model opposite="sources" required="true"
	 * @generated
	 */
	EList<AbstractAction> getTargets();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see cg.CgPackage#getTransition_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link cg.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // Transition
