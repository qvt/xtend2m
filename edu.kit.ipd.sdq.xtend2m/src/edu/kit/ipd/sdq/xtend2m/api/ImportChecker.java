package edu.kit.ipd.sdq.xtend2m.api;

/**
 * Can check an element against a list of import declarations for
 * validity.
 */
public interface ImportChecker {
	/**
	 * Check element against imports.
	 * @param element the element to check
	 * @param imports the list of imports to check
	 * @return true if element is covered by one of the specified imports,
	 * 	false if not
	 */
	public boolean check(String element, String[] imports);
}
