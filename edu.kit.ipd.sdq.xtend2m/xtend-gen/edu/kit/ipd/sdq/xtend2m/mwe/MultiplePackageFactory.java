package edu.kit.ipd.sdq.xtend2m.mwe;

import com.google.common.base.Objects;
import edu.kit.ipd.sdq.xtend2m.api.AbstractModuleFactory;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * A factory that can be used to create EObjects of all packages that
 * are added.
 */
@SuppressWarnings("all")
public class MultiplePackageFactory extends AbstractModuleFactory {
  private final static boolean DEBUG = false;
  
  private String log(final String s) {
    String _xifexpression = null;
    if (MultiplePackageFactory.DEBUG) {
      _xifexpression = InputOutput.<String>println(s);
    }
    return _xifexpression;
  }
  
  private List<EPackage> packages = new ArrayList<EPackage>();
  
  /**
   * Add a package to the factory. <tt>EClass</tt>es contained in
   * the package can then be created by the factory.
   */
  public boolean addPackage(final EPackage p) {
    boolean _xblockexpression = false;
    {
      this.log((("Registered package " + p) + " with factory"));
      _xblockexpression = this.packages.add(p);
    }
    return _xblockexpression;
  }
  
  public <T extends Object> T createObject(final Class<T> clazz) {
    try {
      this.log(("Request to create " + clazz));
      this.checkCreationRights(clazz);
      for (final EPackage pack : this.packages) {
        {
          EList<EClassifier> _eClassifiers = pack.getEClassifiers();
          final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
            public Boolean apply(final EClassifier it) {
              Class<?> _instanceClass = it.getInstanceClass();
              return Boolean.valueOf(Objects.equal(_instanceClass, clazz));
            }
          };
          EClassifier classifier = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(classifier, null));
          if (!_notEquals) {
            _and = false;
          } else {
            _and = (classifier instanceof EClass);
          }
          if (_and) {
            EClass eclass = ((EClass) classifier);
            EFactory _eFactoryInstance = pack.getEFactoryInstance();
            EObject _create = _eFactoryInstance.create(eclass);
            T result = ((T) _create);
            this.log(("Created: " + result));
            this.<T>addObject(clazz, result);
            return result;
          }
        }
      }
      throw new Exception(("Don\'t know how to create " + clazz));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
