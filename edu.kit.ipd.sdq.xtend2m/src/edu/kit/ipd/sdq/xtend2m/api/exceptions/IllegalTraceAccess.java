package edu.kit.ipd.sdq.xtend2m.api.exceptions;

/**
 * Exception that is thrown if a trace is accessed illegally.
 */
public class IllegalTraceAccess extends Exception {
	private static final long serialVersionUID = -5356294907829278229L;

	public IllegalTraceAccess(String string) {
	  super(string);
	}

}
