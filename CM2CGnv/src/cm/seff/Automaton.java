/**
 */
package cm.seff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.Automaton#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getAutomaton()
 * @model abstract="true"
 * @generated
 */
public interface Automaton extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link cm.seff.AbstractAction}.
	 * It is bidirectional and its opposite is '{@link cm.seff.AbstractAction#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see cm.seff.SeffPackage#getAutomaton_Steps()
	 * @see cm.seff.AbstractAction#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<AbstractAction> getSteps();

} // Automaton
