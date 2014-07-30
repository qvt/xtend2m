/**
 */
package cm.composition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ComposedProvidingRequiringEntity combines the properties of an InterfaceProvidingRequiringEntity and a ComposedStructure. It is inherited by all classes that, on the one hand,  claim to implement the functionality specified in an interface as well as to request that functionality, and, on the other hand, are composed out of some inner entities.
 * Valid ComposedProvidingRequiringEntities need to have their ProvidedRoles bound to ProvidedRoles of the contained entities.
 * Prominent examples are System, SubSystem, and CompositeComponents
 * TODO/FIXME: The distinction between ComposedStructure and ComposedProvidingRequiringStructure does not make sense at the moment, because the ComposedStructure already talks about inner provided / required delegation connectors, which only make sense if there are outer roles for interfaces -> ComposedProvidingRequiringStructure. IDEA: Move the delegation connector attributes to ComposedProvidingRequiringStructure. I'm not sure about the assembly connectors. SEE ALSO: ComposedStructure
 * However, as AssemblyContexts of ComposedStructure always contain InterfaceProvidingRequiringEntities at the moment, the above might not help... and we may just want to merge the meta classes. --Anne
 * <!-- end-model-doc -->
 *
 *
 * @see cm.composition.CompositionPackage#getComposedProvidingRequiringEntity()
 * @model abstract="true"
 * @generated
 */
public interface ComposedProvidingRequiringEntity extends ComposedStructure, InterfaceProvidingRequiringEntity {
} // ComposedProvidingRequiringEntity
