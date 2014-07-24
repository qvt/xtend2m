package edu.kit.ipd.sdq.xtend2m.api;

/**
 * A wrapper class for a Trace.
 *
 * @param <From> class of the object from which the trace starts
 * @param <To> class of the object to which the trace points
 */
public class Trace<From, To> {
	/** The start point of the trace. */
	public From from;
	/** The end point of the trace. */
	public To to;
	/** The module in which the trace was created. */
	public String module;
	/** The name of the method in which the trace was created. */
	public String method;
	/** The arguments for the method call in which the trace was created. */
	public Object[] args;
	
	/**
	 * Create a new Trace instance with the supplied arguments
	 * @param from the start point for the new trace
	 * @param to the end point for the new trace
	 * @param module the module for the new trace
	 * @param method the method name for the new trace
	 * @param args the arguments for the method call for the new trace
	 */
	public Trace(From from, To to, String module,
			String method, Object[] args) {
		super();
		this.from = from;
		this.to = to;
		this.module = module;
		this.method = method;
		this.args = args;
	}
	
}
