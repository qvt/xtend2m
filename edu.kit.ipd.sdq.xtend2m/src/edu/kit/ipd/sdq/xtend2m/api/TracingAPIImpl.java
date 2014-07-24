package edu.kit.ipd.sdq.xtend2m.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * A prototypical implementation of the TracingAPI for our
 * module framework.
 */
public class TracingAPIImpl implements TracingAPI {
	// Singleton instance
	private static TracingAPI instance;
	public static TracingAPI init() {
		if (instance == null)
			instance = new TracingAPIImpl();
		return instance;
	}
	
	private List<Trace<EObject, EObject>> traces;
	
	// Generic type to make calls in Xtend more comfortable
	private List<ToResolve<?,?>> resolvings;

	/** class that represents a procedure that is to be called later. (late resolve) */
	private class ToResolve<From, To> {
		public From obj;
		public Procedure1<To> proc;
		public boolean multiple;

		public ToResolve(From obj, Procedure1<To> proc) {
			this.obj = obj;
			this.proc = proc;
			
			this.multiple = false;
		}
		
		public ToResolve(From obj, Procedure1<To> proc, boolean multiple) {
			this.obj = obj;
			this.proc = proc;
			
			this.multiple = multiple;
		}
	}
	
	private TracingAPIImpl() {
		resolvings = new ArrayList<ToResolve<?,?>>();
		traces = new ArrayList<Trace<EObject, EObject>>();
	}

	@SuppressWarnings("unused")
	private void log(String text) {
		if (TracingAPI.DEBUG)
			System.out.println(text);
	}
	
	@Override
	public <From, To> void lateResolveOne(From obj, Procedure1<To> procedure) {
		resolvings.add(new ToResolve<From, To>(obj, procedure));
	}

	@Override
	public <From, To> void lateResolveMultiple(Collection<From> obj,
			Procedure1<Collection<To>> procedure) {
		resolvings.add(new ToResolve<Collection<From>, Collection<To>>(obj, procedure, true));
	}

	@SuppressWarnings("unchecked")
	@Override
	public <From, To> To resolveOne(From from, Class<To> clazz) {
		for (Trace<EObject, EObject> t : traces)
			if (from == t.from && clazz.isInstance(t.to))
				return (To) t.to;
		
		return null;
	}

	@Override
	public <From, To> Collection<To> resolveAll(Collection<From> from,
			Class<To> clazz) {

		Collection<To> result = new HashSet<To>();
		for (From fromObject : from)
			for (Trace<EObject, EObject> t : traces)
				if (fromObject == t.from && clazz.isInstance(t.to))
					result.add(clazz.cast(t.to));
		
		return result;
	}

	@Override
	public void createTrace(EObject from, EObject to, String module,
			String method, Object... args) {
		
		traces.add(new Trace<EObject, EObject>(from, to, module, method, args));
	}

	@Override
	public void solveLateResolvings() {
		for (ToResolve<?,?> toResolve : resolvings)
			if (toResolve.multiple)
				resolveMultipleResolve(toResolve);
			else
				resolveSingleResolve(toResolve);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void resolveSingleResolve(ToResolve toResolve) {
		for (Trace<EObject, EObject> t : traces)
			if (toResolve.obj == t.from)
				toResolve.proc.apply(t.to);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void resolveMultipleResolve(ToResolve toResolve) {
		Collection result = new HashSet();
		
		Collection<EObject> from = (Collection<EObject>) toResolve.obj;
		
		for (EObject obj : from)
			for (Trace<EObject, EObject> t : traces)
				if (t.from == obj)
					result.add(t.to);
	
		toResolve.proc.apply(result);
	}

}
