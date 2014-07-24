package edu.kit.ipd.sdq.xtend2m.annotations

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.Target
import java.lang.annotation.ElementType

/**
 * Marks the read only meta model visibility of the module interface.
 */
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::TYPE)
annotation ModelIn {
	String[] value
}