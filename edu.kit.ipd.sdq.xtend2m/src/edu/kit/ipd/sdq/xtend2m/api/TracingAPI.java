package edu.kit.ipd.sdq.xtend2m.api;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Offers methods that allow the developer to create and resolve
 * traces, similar to QVT's tracing capabilities.
 */
public interface TracingAPI {
	/** The singleton instance of the TracingAPI */
	public final TracingAPI INSTANCE = TracingAPIImpl.init();
	public final boolean DEBUG = true;
	
	/**
	 * Calls the given procedure with the resolved target of obj when
	 * solveLateResolvings is called.
	 * 
	 * @param obj which object to resolve
	 * @param procedure the procedure to call on the object
	 */
	<From, To> void lateResolveOne(From obj,
			Procedure1<To> procedure);
	
	/**
	 * Calls the given procedure with the resolved targets of all Objects
	 * in obj
	 *
	 * @param obj which objects to resolve
	 * @param procedure the procedure to call on the objects
	 */
	<From, To> void lateResolveMultiple(Collection<From> obj,
			Procedure1<Collection<To>> procedure);

	/**
	 * Resolve one target object for a source object 
	 * @param from the object to resolve
	 * @param clazz the class of the target of the resolution
	 * @return an instance of To that is associated with <tt>from</tt>
	 *         through a trace if existant, null otherwise.
	 */
	<From, To> To resolveOne(From from, Class<To> clazz);
	
	/**
	 * Resolve all target objects associated with source objects
	 * @param from the objects to resolve
	 * @param clazz the class of the target of the resolution
	 * @return a collection of associated target objects for all 
	 *         objects in <tt>from</tt>, if existant, else an empty
	 *         collection.
	 */
	<From, To> Collection<To> resolveAll(Collection<From> from, Class<To> clazz);

	/**
	 * Creates a trace with the specified arguments
	 * @param from the start point for the new trace
	 * @param to the end point for the new trace
	 * @param module the module for the new trace
	 * @param method the method name for the new trace
	 * @param args the arguments for the method call for the new trace
	 * 
	 * @see Trace#Trace(Object, Object, String, String, Object[])
	 */
	void createTrace(EObject from, EObject to, String module, String method,
			Object... args);

	void solveLateResolvings();
}
