/**
 */
package cm.repository;

import cm.seff.ServiceEffectSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a black-box component implementation. Basic components are atomic building blocks of a software architecture. They cannot be further subdivided into smaller components and are built from scratch, i.e, not by assembling other components. Component developers specify basic components by associating interfaces to them in a providing or requiring role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.BasicComponent#getServiceEffectSpecifications <em>Service Effect Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getBasicComponent()
 * @model
 * @generated
 */
public interface BasicComponent extends ComponentTypeImplementation {
	/**
	 * Returns the value of the '<em><b>Service Effect Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link cm.seff.ServiceEffectSpecification}.
	 * It is bidirectional and its opposite is '{@link cm.seff.ServiceEffectSpecification#getBasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the service effect specification for services provided by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Effect Specifications</em>' containment reference list.
	 * @see cm.repository.RepositoryPackage#getBasicComponent_ServiceEffectSpecifications()
	 * @see cm.seff.ServiceEffectSpecification#getBasicComponent
	 * @model opposite="basicComponent" containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceEffectSpecification> getServiceEffectSpecifications();

} // BasicComponent
