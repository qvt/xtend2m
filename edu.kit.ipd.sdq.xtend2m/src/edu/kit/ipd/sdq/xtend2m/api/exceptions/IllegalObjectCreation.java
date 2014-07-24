package edu.kit.ipd.sdq.xtend2m.api.exceptions;

/**
 * Exception that is thrown if an object is created at a position
 * where it should not be created.
 */
public class IllegalObjectCreation extends Exception {
	private static final long serialVersionUID = -4191124728718910372L;

	public IllegalObjectCreation(String string) {
	  super(string);
	}

}
