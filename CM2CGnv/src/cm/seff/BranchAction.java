/**
 */
package cm.seff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Service Effect Specification Models the effect of invoking a specific service of a basic component. Therefore, it references a Signature from an Interface, for which the component takes a ProvidedRole, to identify the described service. This class is abstract and SEFFs for specific analysis purposes need to inherit from this class. A BasicComponent may have an arbitrary number of SEFFs. It can have multiple SEFFs of a different type for a single provided service. For example, one SEFF can express all external service calls with no particular order, while another one includes a restricted order, or still another one expresses resource demands of the service.
 * The type currently included in this simple meta-model is a simple state machine with probabilistic branches and external call actions. PCM's original SEFF is the ResourceDemandingSEFF for performance prediction. Different types of SEFFs should not contradict each other if the languages are equally powerful. For example, the order of allowed external service calls should be the same for each SEFF type modeling sequences of such calls if the modeling languages have the same expressiveness. SEFFs are part of a component and not part of an interface, because they are implementation dependent. The SEFFs of a CompositeComponent are not represented in the meta-model and can be derived automatically by connecting the SEFFs of the encapsulated components of its nested AssemblyContexts. Different SEFFs of a single component access the same component parameter specifications. That means that parameter dependencies to the same component parameters in different SEFF types refer also to the same characterizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cm.seff.BranchAction#getBranchTransitions <em>Branch Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see cm.seff.SeffPackage#getBranchAction()
 * @model
 * @generated
 */
public interface BranchAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Branch Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link cm.seff.ProbabilisticBranchTransition}.
	 * It is bidirectional and its opposite is '{@link cm.seff.ProbabilisticBranchTransition#getBranchAction <em>Branch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Transitions</em>' containment reference list.
	 * @see cm.seff.SeffPackage#getBranchAction_BranchTransitions()
	 * @see cm.seff.ProbabilisticBranchTransition#getBranchAction
	 * @model opposite="branchAction" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProbabilisticBranchTransition> getBranchTransitions();

} // BranchAction
