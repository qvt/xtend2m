package edu.kit.ipd.sdq.xtend2m.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import edu.kit.ipd.sdq.xtend2m.api.ModuleFactory;
import edu.kit.ipd.sdq.xtend2m.api.StackTraceCheck;

/**
 * An abstract implementation of the ModuleFactory interface that
 * checks if object creation is allowed when creating instances.
 * 
 * Contains no createObject(Class<T>) method.
 */
public abstract class AbstractModuleFactory implements ModuleFactory {
	private StackTraceCheck stc = new StackTraceCheck();
	protected Map<Class<?>, Collection<EObject>> created = new HashMap<Class<?>, Collection<EObject>>();
	
	/**
	 * Check if the supplied class may be created. Can be
	 * overwritten to perform own checks.
	 * @param clazz the clazz that is to be created
	 */
	protected void checkCreationRights(Class<?> clazz) {
		stc.checkCreationRightsOut(clazz);
	}
	
	/**
	 * Stores the instance inside the class for later retrieval.
	 * @param clazz    the class of the object to add
	 * @param instance the instance that is added
	 */
	protected <T> void addObject(Class<T> clazz, T instance) {
		Collection<EObject> objects = created.get(clazz);
		if (objects == null) {
			objects = new HashSet<EObject>();
			created.put(clazz, objects);
		}
		
		objects.add((EObject) instance);
	}
	
	@Override
	public <T> T createObject(Class<T> clazz, Procedure1<? super T> procedure) {
		T t = createObject(clazz);
		procedure.apply(t);
		return t;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <T> Collection<T> getAll(Class<T> clazz) {
		HashSet<T> result = new HashSet<T>();
		Collection<EObject> createdObjects = created.get(clazz);
		
		if (createdObjects != null)
			for (EObject createdObj : created.get(clazz))
				result.add((T) createdObj);
			
		return result;
	}
	
	@Override
	public List<EObject> getAll() {
		List<EObject> result = new ArrayList<EObject>();
		for (Collection<EObject> objects : created.values())
			result.addAll(objects);
		
		return result;
	}
}
