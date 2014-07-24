package edu.kit.ipd.sdq.xtend2m.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as a creates method.
 * This means that a trace will be created and an object that
 * can be referenced with the variable with the specified <tt>name</tt>
 * (default: result).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Creates {
  public Class<?> value();
  public String name() default "result";
}
