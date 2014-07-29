package trafo.interfaces

import cg.Graph
import cm.composition.AssemblyContext
import cm.repository.Signature
import cm.repository.ProvidedRole
import cm.composition.InterfaceProvidingRequiringEntity
import edu.kit.ipd.sdq.xtend2m.api.MainMethod
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface
import edu.kit.ipd.sdq.xtend2m.annotations.ModelOut
import edu.kit.ipd.sdq.xtend2m.annotations.ModelIn
import cm.seff.ProbabilisticBranchTransition

@TransformationInterface
@ModelOut(#[
	"cg.Graph",
	"*"
])
@ModelIn(#[
	"cm.composition.System",
	"cm.repository.ProvidedRole",
	"cm.repository.Signature",
	"cm.composition.InterfaceProvidingRequiringEntity",
	"cm.seff.ProbabilisticBranchTransition"
])
interface CM2CGRepository extends MainMethod {
	def Graph toNet(ProbabilisticBranchTransition self, AssemblyContext context,
		ProvidedRole role)
		
	def Graph toNet(InterfaceProvidingRequiringEntity self, AssemblyContext context,
		ProvidedRole role, Signature operation)
}