package edu.kit.ipd.sdq.xtend2m.api

import java.util.regex.Pattern
import java.util.ArrayList
import java.util.List

/**
 * Our prototypical implementation of an ImportChecker.
 * 
 * Allows the usage of an asterisk (*) to match any set of characters.
 */
class StarImportChecker implements ImportChecker {
	override check(String element, String[] imports) {
		imports.exists[coveredBy(element, it)]
	}
	
	private def String[] ownSplit(String s, char c) {
		var List<String> result = new ArrayList<String>
		var StringBuilder currentS = new StringBuilder
		for (int i : 0 ..< s.length) {
			if (s.charAt(i) == c) {
				result.add(currentS.toString)
				currentS = new StringBuilder()
			} else
				currentS.append(s.charAt(i))
		}
		result.add(currentS.toString)
		
		result
	}

	private def boolean coveredBy(String element, String importElement) {
		// split the string at the asterisk,
		// quote the single parts and
		// insert .* (match any string) between parts
		val patternString = importElement.ownSplit('*').map[Pattern::quote(it)].join(".*")
		return element.matches(patternString)
	}
}
