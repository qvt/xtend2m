package edu.kit.ipd.sdq.xtend2m.annotations;

import edu.kit.ipd.sdq.xtend2m.annotations.TransformationHandlerProcessor;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.macro.Active;

/**
 * Marks a class as a transformation module.
 * 
 * Active annotation that performs semantic checks and changes the
 * Xtend to Java compilation process with a {@link TransformationHandlerProcessor}
 * 
 * @see TransformationHandlerProcessor
 */
@Active(TransformationHandlerProcessor.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Transformation {
}
