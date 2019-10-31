package com.JAVA.AnnotationAndReflection;

import javax.naming.Name;

/**
 * <p>
 * 说明：将注解添加至某个类的方法上
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 14:03
 */
public class Man {
    @MyAnnotation(name = "name",value = "dong")
    String name = "dong";
    public void say(String name){
        System.out.println("hello");
    }
}
