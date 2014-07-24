package edu.kit.ipd.sdq.xtend2m.annotations


import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.ElementType
import java.lang.annotation.Target

/**
 * Marks the write meta model visibility of the module interface.
 */
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::TYPE)
annotation ModelOut {
	String[] value
}