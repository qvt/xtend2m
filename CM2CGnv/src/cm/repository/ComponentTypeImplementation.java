/**
 */
package cm.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents an abstraction of a component, where both sets of provided and required interfaces as well as the implementation is visible. It fully specifies the component type. The specification of
 * the internal structure depends on the way the component is realised. In general, components can either be implemented from the scratch or composed out of other components. In the first case, the implemented behaviour of each provided service needs to be specified with a service effect specification (SEFF) to describe the component's abstract internal structure. We refer to such components as basic components, since they form the basic building blocks of a software architecture. On the other hand, developers can use existing components to assemble new, composite components.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.repository.ComponentTypeImplementation#getImplementedComponentTypes <em>Implemented Component Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.repository.RepositoryPackage#getComponentTypeImplementation()
 * @model abstract="true"
 * @generated
 */
public interface ComponentTypeImplementation extends RepositoryComponent {
	/**
	 * Returns the value of the '<em><b>Implemented Component Types</b></em>' reference list.
	 * The list contents are of type {@link cm.repository.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the service effect specification for services provided by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Component Types</em>' reference list.
	 * @see cm.repository.RepositoryPackage#getComponentTypeImplementation_ImplementedComponentTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComponentType> getImplementedComponentTypes();

} // ComponentTypeImplementation
