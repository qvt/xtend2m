package trafo.interfaces

import cm.repository.ProvidedRole
import cm.repository.Signature
import cm.composition.System
import cm.composition.AssemblyContext
import cm.composition.ComposedStructure
import cm.seff.ExternalCallAction
import cm.seff.SimpleBehaviorSpecification
import cm.composition.InterfaceProvidingRequiringEntity
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface

@TransformationInterface
interface CMLibrary {
	def ProvidedRole findRole(System system, String providedRoleToCall)
	def Signature findOperation(ProvidedRole role, String providedOperationToCall)
	def AssemblyContext getInnerAssemblyContext(ProvidedRole role, ComposedStructure composedStructure)
	def ProvidedRole getInnerRole(ProvidedRole role, ComposedStructure composedStructure)
	def AssemblyContext getCalledAssemblyContext(ExternalCallAction callAction, AssemblyContext context)
	def ProvidedRole getCalledRole(ExternalCallAction callAction, AssemblyContext context)
	def SimpleBehaviorSpecification getSimpleBehaviorSpecification(InterfaceProvidingRequiringEntity entity,
		Signature operation
	)
}