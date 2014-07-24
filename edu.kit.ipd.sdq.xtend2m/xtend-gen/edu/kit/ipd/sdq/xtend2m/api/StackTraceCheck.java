package edu.kit.ipd.sdq.xtend2m.api;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import edu.kit.ipd.sdq.xtend2m.annotations.ModelOut;
import edu.kit.ipd.sdq.xtend2m.annotations.TransformationInterface;
import edu.kit.ipd.sdq.xtend2m.api.ImportChecker;
import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker;
import edu.kit.ipd.sdq.xtend2m.api.exceptions.IllegalObjectCreation;
import java.lang.annotation.Annotation;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Class that checks creation rights for a class against the current
 * stack trace.
 */
@SuppressWarnings("all")
public class StackTraceCheck {
  /**
   * the ImportChecker that is used for coverage checking
   */
  private ImportChecker importChecker = new StarImportChecker();
  
  /**
   * Finds classes in the current stack trace that are
   * annotated with @TransformationInterface.
   * 
   * @param stackTrace the stack trace to filter
   * @return @TransformationInterface-annotated classes inside the trace
   */
  private String[] getFilteredStackTrace(final StackTraceElement[] stackTrace) {
    final Function1<StackTraceElement, String> _function = new Function1<StackTraceElement, String>() {
      public String apply(final StackTraceElement it) {
        return it.getClassName();
      }
    };
    List<String> _map = ListExtensions.<StackTraceElement, String>map(((List<StackTraceElement>)Conversions.doWrapArray(stackTrace)), _function);
    final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
      public Boolean apply(final String it) {
        try {
          Class<?> _forName = Class.forName(it);
          Class<?>[] _interfaces = _forName.getInterfaces();
          final Function1<Class<?>, Boolean> _function = new Function1<Class<?>, Boolean>() {
            public Boolean apply(final Class<?> it) {
              Annotation[] _annotations = it.getAnnotations();
              final Function1<Annotation, Boolean> _function = new Function1<Annotation, Boolean>() {
                public Boolean apply(final Annotation it) {
                  Class<? extends Annotation> _annotationType = it.annotationType();
                  return Boolean.valueOf(Objects.equal(_annotationType, TransformationInterface.class));
                }
              };
              return Boolean.valueOf(IterableExtensions.<Annotation>exists(((Iterable<Annotation>)Conversions.doWrapArray(_annotations)), _function));
            }
          };
          return Boolean.valueOf(IterableExtensions.<Class<?>>exists(((Iterable<Class<?>>)Conversions.doWrapArray(_interfaces)), _function));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    return ((String[])Conversions.unwrapArray(IterableExtensions.<String>filter(_map, _function_1), String.class));
  }
  
  /**
   * Check if the fully qualified name of clazz is covered by one of the @ModelIn
   * present in an interface annotated with @TransformationInterface implemented by one
   * of the classes in the current StackTrace.
   * 
   * @throws IllegalObjectCreation if the class may not be created
   */
  public void checkCreationRightsOut(final Class<?> clazz) {
    try {
      Exception _exception = new Exception();
      final StackTraceElement[] stackTrace = _exception.getStackTrace();
      final String[] modelElements = this.getFilteredStackTrace(stackTrace);
      boolean valid = false;
      StackTraceElement _get = stackTrace[0];
      String className = _get.getClassName();
      int _size = ((List<String>)Conversions.doWrapArray(modelElements)).size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(modelElements)));
        className = _head;
        Class<?> _forName = Class.forName(className);
        final Class<?>[] clInterfaces = _forName.getInterfaces();
        for (final Class<?> clInterface : clInterfaces) {
          Annotation[] _annotations = clInterface.getAnnotations();
          Iterable<ModelOut> _filter = Iterables.<ModelOut>filter(((Iterable<?>)Conversions.doWrapArray(_annotations)), ModelOut.class);
          for (final ModelOut mo : _filter) {
            boolean _or = false;
            if (valid) {
              _or = true;
            } else {
              String _canonicalName = clazz.getCanonicalName();
              String[] _value = mo.value();
              boolean _check = this.importChecker.check(_canonicalName, _value);
              _or = _check;
            }
            valid = _or;
          }
        }
      }
      if ((!valid)) {
        String _canonicalName_1 = clazz.getCanonicalName();
        String _plus = ("Illegal object creation: " + _canonicalName_1);
        String _plus_1 = (_plus + " by ");
        String _plus_2 = (_plus_1 + className);
        throw new IllegalObjectCreation(_plus_2);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
