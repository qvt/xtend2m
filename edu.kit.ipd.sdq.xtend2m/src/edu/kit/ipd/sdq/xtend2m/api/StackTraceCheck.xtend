package edu.kit.ipd.sdq.xtend2m.api

import edu.kit.ipd.sdq.xtend2m.api.exceptions.IllegalObjectCreation
import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface
import edu.kit.ipd.sdq.xtend2m.annotations.ModelOut

/**
 * Class that checks creation rights for a class against the current
 * stack trace.
 */
class StackTraceCheck {
	/** the ImportChecker that is used for coverage checking */
	private var ImportChecker importChecker = new StarImportChecker
	
	/**
	 * Finds classes in the current stack trace that are
	 * annotated with @TransformationInterface.
	 * 
	 * @param stackTrace the stack trace to filter
	 * @return @TransformationInterface-annotated classes inside the trace
	 */
	private def String[] getFilteredStackTrace(StackTraceElement[] stackTrace) {
		stackTrace.map[className].filter[
			Class::forName(it).interfaces.exists[
				it.annotations.exists[
					it.annotationType == typeof(TransformationInterface)
				]
			]
		]		
	}
	
	/**
	 * Check if the fully qualified name of clazz is covered by one of the @ModelIn
	 * present in an interface annotated with @TransformationInterface implemented by one
	 * of the classes in the current StackTrace.
	 * 
	 * @throws IllegalObjectCreation if the class may not be created
	 */
	public def checkCreationRightsOut(Class<?> clazz) {
		val stackTrace = (new Exception()).stackTrace
		val modelElements = getFilteredStackTrace(stackTrace)
		var valid = false
		var className = stackTrace.get(0).className
		
		if (modelElements.size != 0) {
			className = modelElements.head
			val clInterfaces = Class::forName(className).interfaces
			for (Class<?> clInterface : clInterfaces) {
				for (ModelOut mo : clInterface.annotations.filter(typeof(ModelOut))) {
					valid = valid || importChecker.check(clazz.canonicalName, mo.value)
				}
			}
		}
		if (!valid) {
			throw new IllegalObjectCreation("Illegal object creation: " + clazz.canonicalName + " by " + className)
		}
	}
}
