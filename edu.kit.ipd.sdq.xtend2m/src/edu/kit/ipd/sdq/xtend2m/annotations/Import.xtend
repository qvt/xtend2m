package edu.kit.ipd.sdq.xtend2m.annotations

import org.eclipse.xtend.lib.macro.TransformationParticipant
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration
import org.eclipse.xtend.lib.macro.Active
import java.util.List
import org.eclipse.xtend.lib.macro.TransformationContext
import com.google.inject.Inject
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import java.lang.annotation.ElementType

/**
 * Marks a field as an module import.
 * 
 * Only interfaces with @TransformationInterface annotation can be
 * imported. The imported field is automatically marked as an
 * @Extension (if it is not already).
 */
@Active(typeof(ImportProcessor))
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::FIELD)
annotation Import {
}

/**
 * Active annotation processor for the @Import annotation.
 */
class ImportProcessor implements TransformationParticipant<MutableFieldDeclaration> {
	
	/**
	 * The transformation method for the annotation processor.
	 * - Checks if the imported type is actually a transformation module interface.
	 * - adds a @Extension and @Inject annotation to the field
	 */
	override doTransform(List<? extends MutableFieldDeclaration> annotatedTargetElements, extension TransformationContext context) {
		val transformationInterfaceType = typeof(TransformationInterface).findTypeGlobally
		val extensionAnnotationType = typeof(Extension).newAnnotationReference
		val injectAnnotationType = typeof(Inject).newAnnotationReference
		
		for (field : annotatedTargetElements) {		
			var importable = false
			
			val fieldType = findTypeGlobally(field.type.name)
			// only interfaces can be importable ...
			if (fieldType instanceof InterfaceDeclaration) {
				// ... and they have to have a @TransformationInterface annotation
				importable = (fieldType as InterfaceDeclaration).annotations.exists [
					it.annotationTypeDeclaration.equals(transformationInterfaceType)
				]
			}
			
			if (!importable) {
				field.addError(field.type.name + " is not a transformation module")
			} else {
				if (!field.annotations.exists[it.annotationTypeDeclaration == extensionAnnotationType.annotationTypeDeclaration]) {
					field.addAnnotation(extensionAnnotationType)
				}
				field.addAnnotation(injectAnnotationType)
			}
		}
	}
	
}