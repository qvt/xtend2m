package trafo.impl

import cg.AbstractAction
import cg.Action
import cg.ComposedAction
import cg.Graph
import cg.InputAction
import cg.OutputAction
import cg.Transition
import cm.composition.AssemblyContext
import cm.repository.ProvidedRole
import cm.seff.BranchAction
import cm.seff.ExternalCallAction
import cm.seff.InternalAction
import cm.seff.StartAction
import cm.seff.StopAction
import edu.kit.ipd.sdq.xtend2m.annotations.Creates
import edu.kit.ipd.sdq.xtend2m.annotations.Import
import edu.kit.ipd.sdq.xtend2m.annotations.Transformation
import trafo.interfaces.CM2CGRepository
import trafo.interfaces.CM2CGSEFF
import trafo.interfaces.CMLibrary
import cm.composition.ComposedProvidingRequiringEntity
import cm.repository.Signature

@Transformation
class CM2CGSEFFImpl implements CM2CGSEFF {
	@Import extension CM2CGRepository
	@Import extension CMLibrary

	def log(String s) {
		println(s)
	}

	// MAPPINGS	
	@Creates(typeof(Graph))
	override Graph toNet(ComposedProvidingRequiringEntity self, AssemblyContext context,
		ProvidedRole role, Signature operation) { 

		log('v-- ComposedProvidingRequiringEntity::toNet -----------------------');
//		log(result.toString)
		log('Mapping composite component ' + self.entityName);	

		val innerContext = getInnerAssemblyContext(role, self)
		val innerRole = getInnerRole(role, self)

		innerContext.encapsulatedComponent.toNet(innerContext, innerRole, operation)

		val p1 = createObject(typeof(InputAction)) [
			name = "Start"
		]

		val p2 = createObject(typeof(ComposedAction)) [
			name = "Call " + innerContext.encapsulatedComponent.entityName 
			net = resolveOne(innerContext.encapsulatedComponent, typeof(Graph))
		]

		val p3 = createObject(typeof(OutputAction)) [
			name = "Stop"
		]

		var t1 = createObject(typeof(Transition)) [
			sources.clear; sources += p1
			targets.clear; targets += p2
		]

		val t2 = createObject(typeof(Transition)) [
			sources.clear; sources += p2
			targets.clear; targets += p3
		]

		result.name = self.entityName + ': ' + role.entityName + ': ' + operation.entityName
		result.actions += p1; result.actions += p2; result.actions += p3
		result.transitions += t1; result.transitions += t2
		
		log('^-- ComposedProvidingRequiringEntity::toNet -----------------------')
	}

	// inheritance
	override AbstractAction toDisjunctPlace(cm.seff.AbstractAction self, AssemblyContext context, ProvidedRole role) {
		switch (self) {
			StartAction:		(self as StartAction).toAction(context, role)
			StopAction:			(self as StopAction).toAction(context, role)
			InternalAction:		(self as InternalAction).toAction(context, role)
			BranchAction:		(self as BranchAction).toAction(context, role)
			ExternalCallAction:	(self as ExternalCallAction).toAction(context, role)
			default: { log('Unhandled!'); null as AbstractAction; }
		}
	}
	
	// abstract
	def toAbstractAction(cm.seff.AbstractAction self, AbstractAction result, AssemblyContext context, ProvidedRole role) {
		log('Mapping action ' + self.entityName + " (" + self.getClass + ")")
		result.name = self.entityName
	}
	
	@Creates(typeof(InputAction))
	override InputAction toAction(StartAction self, AssemblyContext context, ProvidedRole role) {
		// inheritance
		toAbstractAction(self, result, context, role)
	}
	
	@Creates(typeof(OutputAction))
	override OutputAction toAction(StopAction self, AssemblyContext context, ProvidedRole role) {
		// inheritance
		toAbstractAction(self, result, context, role)
	}
	
	@Creates(typeof(Action))
	override Action toAction(InternalAction self, AssemblyContext context, ProvidedRole role) {
		// inheritance
		toAbstractAction(self, result, context, role)
	}
	
	@Creates(typeof(Action))
	override Action toAction(BranchAction self2, AssemblyContext context, ProvidedRole role) {
		// inheritance
		toAbstractAction(self2, result, context, role)
		
		// for each branch, create weighted transitions to new composite action
		val parentNet = resolveOne(context.encapsulatedComponent, typeof(Graph));
		log('Adding branching action to ' + parentNet.name);
		self2.branchTransitions.forEach [ bt |
			val p = createObject(typeof(ComposedAction)) [
				 name = bt.entityName
				 net = bt.toNet(context, role)
			]
		
			val t1 = createObject(typeof(Transition)) [
				name = self2.entityName + ' -> ' + bt.entityName
				sources += resolveOne(self2, typeof(AbstractAction))
				targets += p
			]
			
			var t2 = createObject(typeof(Transition)) [
				name = bt.entityName + ' -> ' + self2.successor.entityName;
				sources += p;
			]
			
			val finalT2 = t2
			self2.successor.lateResolveOne [
				succ | finalT2.targets.add(succ)
			]
		
			parentNet.actions += p
			parentNet.transitions += t1
			parentNet.transitions += t2
		]
	}

	@Creates(typeof(ComposedAction))
	override ComposedAction toAction(ExternalCallAction self, AssemblyContext context, ProvidedRole role) {
		// inheritance
		toAbstractAction(self, result, context, role)
		
		log('External call to ' + self.calledService.entityName);
		
		// delegate to called assembly context, and role; operation as given by action
		var calledContext = getCalledAssemblyContext(self, context)
		var calledRole = getCalledRole(self, context)
		log('Found called context ' + calledContext.encapsulatedComponent.entityName);
	
		result.net = toNet(calledContext.encapsulatedComponent,
			calledContext, calledRole, self.calledService)
	}
	
	override Transition toTransition(cm.seff.AbstractAction self) {
		if (self.predecessor != null)
			return toTransitionHelper(self)
		else
			return null
	}
	
	@Creates(typeof(Transition))
	def Transition toTransitionHelper(cm.seff.AbstractAction self) {
		log('Connecting actions ' + self.predecessor.entityName + ' -> ' + self.entityName)
		
		result.name = self.predecessor.entityName + ' -> ' + self.entityName
		result.sources.clear
		var AbstractAction actionSource = resolveOne(self.predecessor, typeof(AbstractAction))
		if (actionSource != null)
			result.sources.add(actionSource)

		result.targets.clear
		var AbstractAction actionTarget = resolveOne(self, typeof(AbstractAction))
		if (actionTarget != null)
			result.targets.add(actionTarget)
	}
}
