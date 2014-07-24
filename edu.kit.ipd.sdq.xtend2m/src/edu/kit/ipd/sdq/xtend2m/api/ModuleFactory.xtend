package edu.kit.ipd.sdq.xtend2m.api

import java.util.Collection
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.eclipse.emf.ecore.EObject
import java.util.List

/**
 * Interface to describe the methods that a factory
 * used for our module system has to offer.
 */
interface ModuleFactory {
	/**
	 * Create an instance of the supplied class.
	 * 
	 * @param clazz the class to instantiate
	 */
	def <T> T createObject(Class<T> clazz)
	
	/**
	 * Create an instance of the supplied class and call
	 * a method wit the new instance as its parameter.
	 * 
	 * @param clazz     the class to instantiate
	 * @param procedure the method to call
	 */
	def <T> T createObject(Class<T> clazz, Procedure1<? super T> procedure)
	
	/**
	 * Return all instances of the class that were created by this
	 * factory.
	 * 
	 * @param clazz the clazz whose instances are retrieved
	 */
	def <T> Collection<T> getAll(Class<T> clazz)
	
	/**
	 * Return all instances that were created by this factory.
	 */
	def List<EObject> getAll()
}