package edu.kit.ipd.sdq.xtend2m.api;

import java.util.Arrays;

import org.junit.Test;

import edu.kit.ipd.sdq.xtend2m.api.StarImportChecker;

/**
 * A JUnit test for the ImportChecker.
 */
public class ImportCheckerTest {
	@Test
	public void testCheck() {
		StarImportChecker tester = new StarImportChecker();
		String[] testStrings = new String[] { "cg.abc", "cg.abc.xyz", "cg.def",
				"cm.xyz" };
		
		String[][] testImports = new String[][] {
				new String[] {
					"cg.*"
				},
				new String[] {
					"cg.abc", "cg.abc.xyz", "cg.def",
					"cm.xyz" 
				},
				new String[] {
					"cg.*", "cm.*"
				},
				new String[] {
					"cg.abc", "cg.abc.xyz", "cg.def"
				},
				new String[] {
					"*"
				}
		};
		
		System.out.println("test elements: ");
		System.out.println(Arrays.toString(testStrings));
		for (String[] testImport : testImports) {
			System.out.println("Interface: " + 
				Arrays.toString(testImport));
			for (String testString : testStrings) {
				System.out.println("test: " + testString + ", " + tester.check(testString, testImport));
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ImportCheckerTest().testCheck();
	}

}
