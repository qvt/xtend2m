package trafo.impl

import cg.Graph
import cm.composition.AssemblyContext
import cm.composition.InterfaceProvidingRequiringEntity
import cm.composition.System
import cm.repository.ProvidedRole
import cm.repository.Signature
import cm.seff.ProbabilisticBranchTransition
import edu.kit.ipd.sdq.xtend2m.annotations.Creates
import org.eclipse.emf.ecore.EObject
import trafo.interfaces.CM2CGRepository
import trafo.interfaces.CM2CGSEFF
import trafo.interfaces.CMLibrary
import edu.kit.ipd.sdq.xtend2m.annotations.Import
import java.util.List
import edu.kit.ipd.sdq.xtend2m.annotations.Transformation

@Transformation
class CM2CGRepositoryImpl implements CM2CGRepository {
	@Import extension CM2CGSEFF
	@Import extension CMLibrary

	def log(String s) { println(s) }

	override void main(List<List<EObject>> input) {
		var system = input.head.filter(typeof(System)).head
		var role = findRole(system, getConfigItem("providedRoleToCall"))
		var operation = findOperation(role, getConfigItem("providedOperationToCall"))
	
		log('Found system' + system.entityName)
		log('Found role ' + role.entityName)
		log('Found operation ' + operation.entityName)
	
		log("Starting CM2CG transformation");
		log('v-- main ----------------------------------------------------------');
		log("Creating call graph for " +
			getConfigItem("providedRoleToCall") + ":" +
			getConfigItem("providedOperationToCall")
		);
	
		system.toNet(null, role, operation)

		log('^-- main ----------------------------------------------------------');
		log("Finishing CM2CG transformation");
		
		solveLateResolvings
	}
	
	@Creates(typeof(Graph))
	override Graph toNet(ProbabilisticBranchTransition self, AssemblyContext context,
		ProvidedRole role) {

		log('v-- ProbabilisticBranchTransition::toNet --------------------------');
		log('Mapping inner automaton ' + self.entityName);
				
		// setup result attributes: map each step to a callgraph action
		result.name = self.entityName;
		result.actions += self.steps.map[toDisjunctPlace(context, role)];
		result.transitions += self.steps.map[toTransition].filterNull;
		
		log('^-- ProbabilisticBranchTransition::toNet --------------------------');
	}
	
	@Creates(typeof(Graph))
	override Graph toNet(InterfaceProvidingRequiringEntity self, AssemblyContext context,
		ProvidedRole role, Signature operation) {
		
		log('v-- InterfaceProvidingRequiringEntity::toNet ----------------------');
		log('Mapping basic component ' + self.entityName + ': ' + operation.entityName);
	
		val seff = getSimpleBehaviorSpecification(self, operation)
		val steps = seff.steps
	
		log('Found behavior specification for service ' + seff.describedService.entityName + ' with ' + steps.size() + ' steps');

		result.name = self.entityName + ": " + role.entityName + ": " + operation.entityName
		result.actions += steps.map[step | toDisjunctPlace(step, context, role)]
		result.transitions += steps.map[step | toTransition(step)].filterNull
		
		log('^-- InterfaceProvidingRequiringEntity::toNet ----------------------')
	}
}