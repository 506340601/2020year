package com.lsl.java;

import java.lang.annotation.*;

/**
 * @author Long
 * @Date 2020/3/9 12:43
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
