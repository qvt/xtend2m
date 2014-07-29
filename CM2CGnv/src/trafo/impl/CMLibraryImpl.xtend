package trafo.impl

import cm.composition.AssemblyConnector
import cm.composition.AssemblyContext
import cm.composition.ComposedStructure
import cm.composition.InterfaceProvidingRequiringEntity
import cm.composition.ProvidedDelegationConnector
import cm.composition.System
import cm.repository.BasicComponent
import cm.repository.ProvidedRole
import cm.repository.Signature
import cm.seff.ExternalCallAction
import cm.seff.SimpleBehaviorSpecification
import trafo.interfaces.CMLibrary
import edu.kit.ipd.sdq.xtend2m.annotations.Transformation

@Transformation
class CMLibraryImpl implements CMLibrary {
	//
	// Extensions (CMLibrary.qvto)
	//
	override ProvidedRole findRole(System system, String providedRoleToCall) {
		system.providedRoles.findFirst[entityName == providedRoleToCall]
	}
	
	override Signature findOperation(ProvidedRole role, String providedOperationToCall) {
		println("Searching for " + providedOperationToCall + " in " + role)
		println("Role: " + role)
		println("ProvidedInterface: " + role.providedInterface)
		println("Interfaces: " + role.providedInterface.signatures)

		role.providedInterface.signatures.findFirst[entityName == providedOperationToCall]
	}
	
	override AssemblyContext getInnerAssemblyContext(ProvidedRole role, ComposedStructure composedStructure) {
		composedStructure.connectors.filter(typeof(ProvidedDelegationConnector)).findFirst[outerProvidedRole == role]?.assemblyContext
	}

	override ProvidedRole getInnerRole(ProvidedRole role, ComposedStructure composedStructure) {
		composedStructure.connectors.filter(typeof(ProvidedDelegationConnector)).findFirst[outerProvidedRole == role]?.innerProvidedRole
	}
	
	override AssemblyContext getCalledAssemblyContext(ExternalCallAction callAction, AssemblyContext context) {
		var connectors = context.parentStructure.connectors.filter(typeof(AssemblyConnector))
		var contexts = connectors.filter[requiringAssemblyContext == context].map[providingAssemblyContext]
		var calledContexts = contexts.findFirst[ c |
			var providedRoles = c.encapsulatedComponent.providedRoles.filter(typeof(ProvidedRole))
			providedRoles.exists[providedInterface.signatures.contains(callAction.calledService)]
		]
		
		calledContexts
	}
	
	override ProvidedRole getCalledRole(ExternalCallAction callAction, AssemblyContext context) {
		var connectors = context.parentStructure.connectors.filter(typeof(AssemblyConnector))
		var contexts = connectors.filter[requiringAssemblyContext == context].map[providingAssemblyContext]
		
		var calledRoles = contexts.map[
			encapsulatedComponent.providedRoles.filter(typeof(ProvidedRole))
		].flatten.findFirst[ c |
			c.providedInterface.signatures.contains(callAction.calledService)
		]

		calledRoles
	}
	
	override SimpleBehaviorSpecification getSimpleBehaviorSpecification(InterfaceProvidingRequiringEntity entity, Signature operation) {
		var seffs = (entity as BasicComponent).serviceEffectSpecifications.filter[describedService == operation]
		var sbs = seffs.filter(typeof(SimpleBehaviorSpecification))
		
		sbs.head
	}
	
	// END Extensions
}