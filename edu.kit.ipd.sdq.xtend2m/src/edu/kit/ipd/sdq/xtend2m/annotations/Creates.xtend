package edu.kit.ipd.sdq.xtend2m.annotations

import java.util.List
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.TransformationParticipant
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import edu.kit.ipd.sdq.xtend2m.api.TracingAPI
import edu.kit.ipd.sdq.xtend2m.api.ModuleFactory
import com.google.inject.Inject
import edu.kit.ipd.sdq.xtend2m.api.Config
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration
import org.eclipse.xtend.lib.macro.declaration.TypeReference
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.ElementType
import java.lang.annotation.Target

/**
 * Marks a class as a transformation module.
 * 
 * Active annotation that performs semantic checks and changes the
 * Xtend to Java compilation process with a {@link TransformationHandlerProcessor}
 * 
 * @see TransformationHandlerProcessor
 */
@Active(typeof(TransformationHandlerProcessor))
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::TYPE)
annotation Transformation {
}

/**
 * Marks a method as a creates method.
 * This means that a trace will be created and an object that
 * can be referenced with the variable with the specified <tt>name</tt>
 * (default: result).
 */
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::METHOD)
annotation Creates {
	Class<?> value;
	String name = "result"
}

/**
 * Handler for the active annotation @Transformation.
 * This handler performs the following tasks for the annotated class, to
 * transform it into a transformation module:
 * - add tracing API, module factory and config
 * - check if a transformation module interface is implemented by the module
 * - transform all @Create methods
 */
class TransformationHandlerProcessor implements TransformationParticipant<MutableClassDeclaration> {
	private final static String FIELD_NAME_TRACING = "__tracingAPI"
	private final static String FIELD_NAME_FACTORY = "__moduleFactory"
	private final static String FIELD_NAME_CONFIG = "__config"
	
	private final static String RESULT_ANNOTATION_FIELD_NAME = "name"
	
	private extension TransformationContext context
	
	/**
	 * Creates a new field in clazz which has both a @Inject and
	 * a @Extension annotation.
	 * 
	 * @param clazz       the class to enhance with the new field
	 * @param name        the name of the new field
	 * @param injectClass the type of the new field
	 */
	private def injectExtension(MutableClassDeclaration clazz, String name, Class<?> injectClass) {
		clazz.addField(name) [
			type = injectClass.newTypeReference()
			addAnnotation(typeof(Inject).newAnnotationReference)
			addAnnotation(typeof(Extension).newAnnotationReference)
		]
	}
	
	/**
	 * Performs the actual transformation described of the class to transform
	 * it into a transformation module.
	 * - add tracing API, module factory and config
	 * - check if a transformation module interface is implemented by the module
	 * - transform all @Create methods
	 */
	override doTransform(List<? extends MutableClassDeclaration> annotatedTargetElements,
		extension TransformationContext context) {
			
		this.context = context
		
		val createsType = typeof(Creates).findTypeGlobally
		val trafoInterfaceType = typeof(TransformationInterface).findTypeGlobally

		for (clazz : annotatedTargetElements) {
			// methods we created during this process (so they are not processed again)
			val createdMethods = <MutableMethodDeclaration>newHashSet
			
			val annotatedMethods = clazz.declaredMethods.filter[findAnnotation(createsType)?.getValue('value') != null]

			// find the transformation module interface implemented by this module
			// used for:
			// - semantic check (module implementation must implement module interface)
			// - traces
			var TypeReference trafoInterfaceParent = null
			for (typeReference : clazz.implementedInterfaces) {
				// this check should always succeed
				if (typeReference.type instanceof InterfaceDeclaration) {
					val iface = (typeReference.type as InterfaceDeclaration)
					if (iface.annotations.exists [
							it.annotationTypeDeclaration.equals(trafoInterfaceType)
						]) {
						trafoInterfaceParent = typeReference
					}
				}
			}
			
			if (trafoInterfaceParent == null)
				clazz.addWarning("Transformation module " + clazz.simpleName + " does not implement transformation interface")

			// the name of the module that is saved for traces
			val traceModule =
				if (trafoInterfaceParent != null)
					trafoInterfaceParent.simpleName
				else
					clazz.simpleName
			
			clazz.injectExtension(FIELD_NAME_TRACING, typeof(TracingAPI))
			clazz.injectExtension(FIELD_NAME_FACTORY, typeof(ModuleFactory))
			clazz.injectExtension(FIELD_NAME_CONFIG, typeof(Config))

			for (m : annotatedMethods) {
				if (!createdMethods.contains(m)) {
					val createAnnotation = m.findAnnotation(createsType)
					// find out the class that has to be created (the JvmType is the
					// Xtend representation of the Java type that is declared in the
					// annotation)
					val annotationType = (createAnnotation.getValue("value") as TypeReference).type
					val resultVariableName = createAnnotation.getValue(RESULT_ANNOTATION_FIELD_NAME) as String;
					val annTypeReference = annotationType.newTypeReference()

					// add proxy method that is called instead of actual method and that handles
					// object creation + tracing and passes it to the method:
					// 1.) copy method
					val newMethodName = "___" + m.simpleName
					val newMethod = clazz.addMethod(newMethodName) [
						setReturnType(m.returnType)
						addParameter(resultVariableName, annTypeReference)
						for (param : m.parameters)
							addParameter(param.simpleName, param.type)
					]
					
					newMethod.setBody(m.body)
					
					m.setReturnType(annTypeReference)
					newMethod.setReturnType(primitiveVoid)

					// pass new "result" variable as first parameter, rest = all parameters
					// of old method
					val parameterPass = newArrayList(resultVariableName)
					for (param : m.parameters)
						parameterPass.add(param.simpleName)

					// trace is created to the from the first parameter
					val rootName = newMethod.parameters.get(1).simpleName

					// 2.) change the original method to perform tracing+object creation
					//     magic and call the new method
					m.setBody ['''
final «annotationType.qualifiedName» «resultVariableName» = this.«FIELD_NAME_FACTORY».<«annotationType.qualifiedName»>createObject(«annotationType.qualifiedName».class);
this.«FIELD_NAME_TRACING».createTrace(«rootName», «resultVariableName», "«traceModule»", "«m.simpleName»", «newMethod.parameters.tail.map[simpleName].join(", ")»);
«newMethodName»(«parameterPass.join(",")»);
return «resultVariableName»;'''
					]

					// so we don't check the modified methods again
					createdMethods.add(m)
					createdMethods.add(newMethod)
				}
			}

		}

	}

}