package edu.kit.ipd.sdq.xtend2m.annotations;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface;
import java.util.List;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.TransformationParticipant;
import org.eclipse.xtend.lib.macro.declaration.AnnotationReference;
import org.eclipse.xtend.lib.macro.declaration.AnnotationTypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.Type;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Active annotation processor for the @Import annotation.
 */
@SuppressWarnings("all")
public class ImportProcessor implements TransformationParticipant<MutableFieldDeclaration> {
  /**
   * The transformation method for the annotation processor.
   * - Checks if the imported type is actually a transformation module interface.
   * - adds a @Extension and @Inject annotation to the field
   */
  public void doTransform(final List<? extends MutableFieldDeclaration> annotatedTargetElements, @Extension final TransformationContext context) {
    final Type transformationInterfaceType = context.findTypeGlobally(TransformationInterface.class);
    final AnnotationReference extensionAnnotationType = context.newAnnotationReference(Extension.class);
    final AnnotationReference injectAnnotationType = context.newAnnotationReference(Inject.class);
    for (final MutableFieldDeclaration field : annotatedTargetElements) {
      {
        boolean importable = false;
        TypeReference _type = field.getType();
        String _name = _type.getName();
        final Type fieldType = context.findTypeGlobally(_name);
        if ((fieldType instanceof InterfaceDeclaration)) {
          Iterable<? extends AnnotationReference> _annotations = ((InterfaceDeclaration) fieldType).getAnnotations();
          final Function1<AnnotationReference, Boolean> _function = new Function1<AnnotationReference, Boolean>() {
            public Boolean apply(final AnnotationReference it) {
              AnnotationTypeDeclaration _annotationTypeDeclaration = it.getAnnotationTypeDeclaration();
              return Boolean.valueOf(_annotationTypeDeclaration.equals(transformationInterfaceType));
            }
          };
          boolean _exists = IterableExtensions.exists(_annotations, _function);
          importable = _exists;
        }
        if ((!importable)) {
          TypeReference _type_1 = field.getType();
          String _name_1 = _type_1.getName();
          String _plus = (_name_1 + " is not a transformation module");
          context.addError(field, _plus);
        } else {
          Iterable<? extends AnnotationReference> _annotations_1 = field.getAnnotations();
          final Function1<AnnotationReference, Boolean> _function_1 = new Function1<AnnotationReference, Boolean>() {
            public Boolean apply(final AnnotationReference it) {
              AnnotationTypeDeclaration _annotationTypeDeclaration = it.getAnnotationTypeDeclaration();
              AnnotationTypeDeclaration _annotationTypeDeclaration_1 = extensionAnnotationType.getAnnotationTypeDeclaration();
              return Boolean.valueOf(Objects.equal(_annotationTypeDeclaration, _annotationTypeDeclaration_1));
            }
          };
          boolean _exists_1 = IterableExtensions.exists(_annotations_1, _function_1);
          boolean _not = (!_exists_1);
          if (_not) {
            field.addAnnotation(extensionAnnotationType);
          }
          field.addAnnotation(injectAnnotationType);
        }
      }
    }
  }
}
