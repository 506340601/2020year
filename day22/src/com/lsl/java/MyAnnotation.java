package com.lsl.java;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author Long
 * @Date 2020/3/9 11:29
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}
