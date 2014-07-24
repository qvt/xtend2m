package edu.kit.ipd.sdq.xtend2m.api;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Interface to describe the methods that a factory
 * used for our module system has to offer.
 */
@SuppressWarnings("all")
public interface ModuleFactory {
  /**
   * Create an instance of the supplied class.
   * 
   * @param clazz the class to instantiate
   */
  public abstract <T extends Object> T createObject(final Class<T> clazz);
  
  /**
   * Create an instance of the supplied class and call
   * a method wit the new instance as its parameter.
   * 
   * @param clazz     the class to instantiate
   * @param procedure the method to call
   */
  public abstract <T extends Object> T createObject(final Class<T> clazz, final Procedure1<? super T> procedure);
  
  /**
   * Return all instances of the class that were created by this
   * factory.
   * 
   * @param clazz the clazz whose instances are retrieved
   */
  public abstract <T extends Object> Collection<T> getAll(final Class<T> clazz);
  
  /**
   * Return all instances that were created by this factory.
   */
  public abstract List<EObject> getAll();
}
