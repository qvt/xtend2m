package edu.kit.ipd.sdq.xtend2m.annotations

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import java.lang.annotation.ElementType
import java.lang.annotation.Target

/**
 * Enables the strict mode for a transformation interface.
 * 
 * If this annotation is present, violations of the meta model
 * accessibility of the interface inside the implementation are
 * annotated with errors, else they are annotated with warnings.
 */
@Retention(RetentionPolicy::RUNTIME)
@Target(ElementType::TYPE)
annotation Strict {}