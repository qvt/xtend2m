package edu.kit.ipd.sdq.xtend2m.api;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * The entry point for the module transformation workflow. Exactly one
 * of the module implementations must implement this MainMethod interface.
 */
public interface MainMethod {
	public void main(List<List<EObject>> input);
}
