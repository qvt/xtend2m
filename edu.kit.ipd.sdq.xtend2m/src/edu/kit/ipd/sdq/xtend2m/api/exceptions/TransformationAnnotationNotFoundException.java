package edu.kit.ipd.sdq.xtend2m.api.exceptions;

/**
 * Exception that is thrown if a class is added to a workflow that is not
 * a transformation module.
 */
public class TransformationAnnotationNotFoundException extends Exception {
	private static final long serialVersionUID = -2716257904454004046L;

	public TransformationAnnotationNotFoundException() {
		super();
	}

	public TransformationAnnotationNotFoundException(String string) {
		super(string);
	}
}
