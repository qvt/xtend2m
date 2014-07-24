package edu.kit.ipd.sdq.xtend2m.annotations;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import edu.kit.ipd.sdq.xtend2m.annotations.Creates;
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface;
import edu.kit.ipd.sdq.xtend2m.api.Config;
import edu.kit.ipd.sdq.xtend2m.api.ModuleFactory;
import edu.kit.ipd.sdq.xtend2m.api.TracingAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.TransformationParticipant;
import org.eclipse.xtend.lib.macro.declaration.AnnotationReference;
import org.eclipse.xtend.lib.macro.declaration.AnnotationTypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.CompilationStrategy;
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.Type;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtend.lib.macro.expression.Expression;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Handler for the active annotation @Transformation.
 * This handler performs the following tasks for the annotated class, to
 * transform it into a transformation module:
 * - add tracing API, module factory and config
 * - check if a transformation module interface is implemented by the module
 * - transform all @Create methods
 */
@SuppressWarnings("all")
public class TransformationHandlerProcessor implements TransformationParticipant<MutableClassDeclaration> {
  private final static String FIELD_NAME_TRACING = "__tracingAPI";
  
  private final static String FIELD_NAME_FACTORY = "__moduleFactory";
  
  private final static String FIELD_NAME_CONFIG = "__config";
  
  private final static String RESULT_ANNOTATION_FIELD_NAME = "name";
  
  @Extension
  private TransformationContext context;
  
  /**
   * Creates a new field in clazz which has both a @Inject and
   * a @Extension annotation.
   * 
   * @param clazz       the class to enhance with the new field
   * @param name        the name of the new field
   * @param injectClass the type of the new field
   */
  private MutableFieldDeclaration injectExtension(final MutableClassDeclaration clazz, final String name, final Class<?> injectClass) {
    final Procedure1<MutableFieldDeclaration> _function = new Procedure1<MutableFieldDeclaration>() {
      public void apply(final MutableFieldDeclaration it) {
        TypeReference _newTypeReference = TransformationHandlerProcessor.this.context.newTypeReference(injectClass);
        it.setType(_newTypeReference);
        AnnotationReference _newAnnotationReference = TransformationHandlerProcessor.this.context.newAnnotationReference(Inject.class);
        it.addAnnotation(_newAnnotationReference);
        AnnotationReference _newAnnotationReference_1 = TransformationHandlerProcessor.this.context.newAnnotationReference(Extension.class);
        it.addAnnotation(_newAnnotationReference_1);
      }
    };
    return clazz.addField(name, _function);
  }
  
  /**
   * Performs the actual transformation described of the class to transform
   * it into a transformation module.
   * - add tracing API, module factory and config
   * - check if a transformation module interface is implemented by the module
   * - transform all @Create methods
   */
  public void doTransform(final List<? extends MutableClassDeclaration> annotatedTargetElements, @Extension final TransformationContext context) {
    this.context = context;
    final Type createsType = context.findTypeGlobally(Creates.class);
    final Type trafoInterfaceType = context.findTypeGlobally(TransformationInterface.class);
    for (final MutableClassDeclaration clazz : annotatedTargetElements) {
      {
        final HashSet<MutableMethodDeclaration> createdMethods = CollectionLiterals.<MutableMethodDeclaration>newHashSet();
        Iterable<? extends MutableMethodDeclaration> _declaredMethods = clazz.getDeclaredMethods();
        final Function1<MutableMethodDeclaration, Boolean> _function = new Function1<MutableMethodDeclaration, Boolean>() {
          public Boolean apply(final MutableMethodDeclaration it) {
            AnnotationReference _findAnnotation = it.findAnnotation(createsType);
            Object _value = null;
            if (_findAnnotation!=null) {
              _value=_findAnnotation.getValue("value");
            }
            return Boolean.valueOf((!Objects.equal(_value, null)));
          }
        };
        final Iterable<? extends MutableMethodDeclaration> annotatedMethods = IterableExtensions.filter(_declaredMethods, _function);
        TypeReference trafoInterfaceParent = null;
        Iterable<? extends TypeReference> _implementedInterfaces = clazz.getImplementedInterfaces();
        for (final TypeReference typeReference : _implementedInterfaces) {
          Type _type = typeReference.getType();
          if ((_type instanceof InterfaceDeclaration)) {
            Type _type_1 = typeReference.getType();
            final InterfaceDeclaration iface = ((InterfaceDeclaration) _type_1);
            Iterable<? extends AnnotationReference> _annotations = iface.getAnnotations();
            final Function1<AnnotationReference, Boolean> _function_1 = new Function1<AnnotationReference, Boolean>() {
              public Boolean apply(final AnnotationReference it) {
                AnnotationTypeDeclaration _annotationTypeDeclaration = it.getAnnotationTypeDeclaration();
                return Boolean.valueOf(_annotationTypeDeclaration.equals(trafoInterfaceType));
              }
            };
            boolean _exists = IterableExtensions.exists(_annotations, _function_1);
            if (_exists) {
              trafoInterfaceParent = typeReference;
            }
          }
        }
        boolean _equals = Objects.equal(trafoInterfaceParent, null);
        if (_equals) {
          String _simpleName = clazz.getSimpleName();
          String _plus = ("Transformation module " + _simpleName);
          String _plus_1 = (_plus + " does not implement transformation interface");
          context.addError(clazz, _plus_1);
        }
        String _xifexpression = null;
        boolean _notEquals = (!Objects.equal(trafoInterfaceParent, null));
        if (_notEquals) {
          _xifexpression = trafoInterfaceParent.getSimpleName();
        } else {
          _xifexpression = clazz.getSimpleName();
        }
        final String traceModule = _xifexpression;
        this.injectExtension(clazz, TransformationHandlerProcessor.FIELD_NAME_TRACING, TracingAPI.class);
        this.injectExtension(clazz, TransformationHandlerProcessor.FIELD_NAME_FACTORY, ModuleFactory.class);
        this.injectExtension(clazz, TransformationHandlerProcessor.FIELD_NAME_CONFIG, Config.class);
        for (final MutableMethodDeclaration m : annotatedMethods) {
          boolean _contains = createdMethods.contains(m);
          boolean _not = (!_contains);
          if (_not) {
            final AnnotationReference createAnnotation = m.findAnnotation(createsType);
            Object _value = createAnnotation.getValue("value");
            final Type annotationType = ((TypeReference) _value).getType();
            Object _value_1 = createAnnotation.getValue(TransformationHandlerProcessor.RESULT_ANNOTATION_FIELD_NAME);
            final String resultVariableName = ((String) _value_1);
            final TypeReference annTypeReference = context.newTypeReference(annotationType);
            String _simpleName_1 = m.getSimpleName();
            final String newMethodName = ("___" + _simpleName_1);
            final Procedure1<MutableMethodDeclaration> _function_2 = new Procedure1<MutableMethodDeclaration>() {
              public void apply(final MutableMethodDeclaration it) {
                TypeReference _returnType = m.getReturnType();
                it.setReturnType(_returnType);
                it.addParameter(resultVariableName, annTypeReference);
                Iterable<? extends MutableParameterDeclaration> _parameters = m.getParameters();
                for (final MutableParameterDeclaration param : _parameters) {
                  String _simpleName = param.getSimpleName();
                  TypeReference _type = param.getType();
                  it.addParameter(_simpleName, _type);
                }
              }
            };
            final MutableMethodDeclaration newMethod = clazz.addMethod(newMethodName, _function_2);
            Expression _body = m.getBody();
            newMethod.setBody(_body);
            m.setReturnType(annTypeReference);
            TypeReference _primitiveVoid = context.getPrimitiveVoid();
            newMethod.setReturnType(_primitiveVoid);
            final ArrayList<String> parameterPass = CollectionLiterals.<String>newArrayList(resultVariableName);
            Iterable<? extends MutableParameterDeclaration> _parameters = m.getParameters();
            for (final MutableParameterDeclaration param : _parameters) {
              String _simpleName_2 = param.getSimpleName();
              parameterPass.add(_simpleName_2);
            }
            Iterable<? extends MutableParameterDeclaration> _parameters_1 = newMethod.getParameters();
            MutableParameterDeclaration _get = ((MutableParameterDeclaration[])Conversions.unwrapArray(_parameters_1, MutableParameterDeclaration.class))[1];
            final String rootName = _get.getSimpleName();
            final CompilationStrategy _function_3 = new CompilationStrategy() {
              public CharSequence compile(final CompilationStrategy.CompilationContext it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("final ");
                String _qualifiedName = annotationType.getQualifiedName();
                _builder.append(_qualifiedName, "");
                _builder.append(" ");
                _builder.append(resultVariableName, "");
                _builder.append(" = this.");
                _builder.append(TransformationHandlerProcessor.FIELD_NAME_FACTORY, "");
                _builder.append(".<");
                String _qualifiedName_1 = annotationType.getQualifiedName();
                _builder.append(_qualifiedName_1, "");
                _builder.append(">createObject(");
                String _qualifiedName_2 = annotationType.getQualifiedName();
                _builder.append(_qualifiedName_2, "");
                _builder.append(".class);");
                _builder.newLineIfNotEmpty();
                _builder.append("this.");
                _builder.append(TransformationHandlerProcessor.FIELD_NAME_TRACING, "");
                _builder.append(".createTrace(");
                _builder.append(rootName, "");
                _builder.append(", ");
                _builder.append(resultVariableName, "");
                _builder.append(", \"");
                _builder.append(traceModule, "");
                _builder.append("\", \"");
                String _simpleName = m.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append("\", ");
                Iterable<? extends MutableParameterDeclaration> _parameters = newMethod.getParameters();
                Iterable<? extends MutableParameterDeclaration> _tail = IterableExtensions.tail(_parameters);
                final Function1<MutableParameterDeclaration, String> _function = new Function1<MutableParameterDeclaration, String>() {
                  public String apply(final MutableParameterDeclaration it) {
                    return it.getSimpleName();
                  }
                };
                Iterable<String> _map = IterableExtensions.map(_tail, _function);
                String _join = IterableExtensions.join(_map, ", ");
                _builder.append(_join, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append(newMethodName, "");
                _builder.append("(");
                String _join_1 = IterableExtensions.join(parameterPass, ",");
                _builder.append(_join_1, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("return ");
                _builder.append(resultVariableName, "");
                _builder.append(";");
                return _builder;
              }
            };
            m.setBody(_function_3);
            createdMethods.add(m);
            createdMethods.add(newMethod);
          }
        }
      }
    }
  }
}
