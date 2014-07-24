package edu.kit.ipd.sdq.xtend2m.annotations;

import edu.kit.ipd.sdq.xtend2m.annotations.ImportProcessor;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.macro.Active;

/**
 * Marks a field as an module import.
 * 
 * Only interfaces with @TransformationInterface annotation can be
 * imported. The imported field is automatically marked as an
 * @Extension (if it is not already).
 */
@Active(ImportProcessor.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Import {
}
