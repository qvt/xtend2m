package edu.kit.ipd.sdq.xtend2m.mwe

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import java.util.ArrayList
import java.util.List
import edu.kit.ipd.sdq.xtend2m.api.AbstractModuleFactory

/**
 * A factory that can be used to create EObjects of all packages that
 * are added.
 */
class MultiplePackageFactory extends AbstractModuleFactory {
	private final static boolean DEBUG = false
	
	private def log(String s) {
		if (DEBUG)
			println(s)
	}
	
	private List<EPackage> packages = new ArrayList<EPackage>

	/**
	 * Add a package to the factory. <tt>EClass</tt>es contained in
	 * the package can then be created by the factory.
	 */
	def addPackage(EPackage p) {
		log("Registered package " + p + " with factory")
		packages.add(p)
	}

	// NB: Now and then, Xtend erroneously complaints about a bug in the line below. Recompiling fixes the issue. 
	override <T> createObject(Class<T> clazz) {
		log("Request to create " + clazz)
		checkCreationRights(clazz);

		// find correct package for clazz and create an instance with the
		// EPackage's EFactory.
		for (pack : packages) {
			var classifier = pack.getEClassifiers.findFirst[instanceClass == clazz]
		
			if (classifier != null && classifier instanceof EClass) {
				var eclass = classifier as EClass
				var result = pack.getEFactoryInstance.create(eclass) as T
				log("Created: " + result)
				addObject(clazz, result)
				return result
			}	
		}
		
		throw new Exception("Don't know how to create " + clazz)
	}
	
}