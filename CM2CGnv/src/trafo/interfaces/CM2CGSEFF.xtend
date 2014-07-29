package trafo.interfaces

import cg.Action
import cg.ComposedAction
import cg.InputAction
import cg.OutputAction
import cg.Transition
import cm.composition.AssemblyContext
import cm.repository.ProvidedRole
import cm.seff.AbstractAction
import cm.seff.BranchAction
import cm.seff.ExternalCallAction
import cm.seff.InternalAction
import cm.seff.StartAction
import cm.seff.StopAction
import edu.kit.ipd.sdq.xtend2m.annotations.ModelIn
import edu.kit.ipd.sdq.xtend2m.annotations.ModelOut
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface
import cg.Graph
import cm.composition.ComposedProvidingRequiringEntity
import cm.repository.Signature
import edu.kit.ipd.sdq.xtend2m.annotations.Strict

@TransformationInterface
@ModelOut(#[
	"cg.Action",
	"cg.InputAction",
	"cg.OutputAction",

	"cg.Transition",
	"cg.ComposedAction",
	
	"cg.Graph"
])
@ModelIn(#[
	"cg.AbstractAction",
	
	"cm.composition.AssemblyContext",
	"cm.composition.ComposedProvidingRequiringEntity",
	"cm.repository.ProvidedRole",
	"cm.repository.Signature",
	
	"cm.seff.*Action"
])
@Strict
interface CM2CGSEFF {
	def Graph toNet(ComposedProvidingRequiringEntity self, AssemblyContext context,
		ProvidedRole role, Signature operation)
	
	def cg.AbstractAction toDisjunctPlace(AbstractAction self, AssemblyContext context, ProvidedRole role)
	
	def InputAction toAction(StartAction self, AssemblyContext context, ProvidedRole role)
	def OutputAction toAction(StopAction self, AssemblyContext context, ProvidedRole role)
	def Action toAction(InternalAction self, AssemblyContext context, ProvidedRole role)
	def Action toAction(BranchAction self, AssemblyContext context, ProvidedRole role)
	
	def ComposedAction toAction(ExternalCallAction self, AssemblyContext context, ProvidedRole role)
	def Transition toTransition(AbstractAction self)
}