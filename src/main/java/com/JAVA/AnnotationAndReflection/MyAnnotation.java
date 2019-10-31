package com.JAVA.AnnotationAndReflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 说明：自定义注解
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 14:01
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name();
    String value();
}
