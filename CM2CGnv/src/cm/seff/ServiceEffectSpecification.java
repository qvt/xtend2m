/**
 */
package cm.seff;

import cm.repository.BasicComponent;
import cm.repository.Signature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StopActions end a scenario behavior and contain only a predecessor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.ServiceEffectSpecification#getDescribedService <em>Described Service</em>}</li>
 *   <li>{@link cm.seff.ServiceEffectSpecification#getBasicComponent <em>Basic Component</em>}</li>
 *   <li>{@link cm.seff.ServiceEffectSpecification#getInternalBehaviours <em>Internal Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getServiceEffectSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ServiceEffectSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Described Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Service</em>' reference.
	 * @see #setDescribedService(Signature)
	 * @see cm.seff.SeffPackage#getServiceEffectSpecification_DescribedService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getDescribedService();

	/**
	 * Sets the value of the '{@link cm.seff.ServiceEffectSpecification#getDescribedService <em>Described Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Service</em>' reference.
	 * @see #getDescribedService()
	 * @generated
	 */
	void setDescribedService(Signature value);

	/**
	 * Returns the value of the '<em><b>Basic Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.repository.BasicComponent#getServiceEffectSpecifications <em>Service Effect Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component</em>' container reference.
	 * @see #setBasicComponent(BasicComponent)
	 * @see cm.seff.SeffPackage#getServiceEffectSpecification_BasicComponent()
	 * @see cm.repository.BasicComponent#getServiceEffectSpecifications
	 * @model opposite="serviceEffectSpecifications" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BasicComponent getBasicComponent();

	/**
	 * Sets the value of the '{@link cm.seff.ServiceEffectSpecification#getBasicComponent <em>Basic Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Component</em>' container reference.
	 * @see #getBasicComponent()
	 * @generated
	 */
	void setBasicComponent(BasicComponent value);

	/**
	 * Returns the value of the '<em><b>Internal Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link cm.seff.InternalBehaviour}.
	 * It is bidirectional and its opposite is '{@link cm.seff.InternalBehaviour#getServiceEffectSpecifications <em>Service Effect Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Behaviours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Behaviours</em>' containment reference list.
	 * @see cm.seff.SeffPackage#getServiceEffectSpecification_InternalBehaviours()
	 * @see cm.seff.InternalBehaviour#getServiceEffectSpecifications
	 * @model opposite="serviceEffectSpecifications" containment="true" ordered="false"
	 * @generated
	 */
	EList<InternalBehaviour> getInternalBehaviours();

} // ServiceEffectSpecification
