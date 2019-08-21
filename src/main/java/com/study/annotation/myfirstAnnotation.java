package com.study.annotation;

import org.apache.ibatis.plugin.Intercepts;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)    //标记被注解的注解在何时起作用，一共三个，源码阶段，编译阶段，运行阶段，范围依次变大
@Target(ElementType.METHOD)    //标记注解用的位置，此为方法，还可以是类，属性等等
@Inherited      //意味着这个标签可以被继承，父类有这个标签，那么子类也会有。

public @interface myfirstAnnotation {
    /**
     * 注解描述
     * @return
     */
    String descri() default "";

}
