package com.JAVA;

import com.JAVA.Entity.Apple;
import java.lang.reflect.Method;

/**
 * <p>
 * 说明：获取从com开始的全类名，此例可以用于反射
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 15:13
 */
public class Test2 {
    public static void main (String[] args) {
        Apple apple = new Apple("red","33g");
        System.out.println(apple.getClass().getName());
        //获取自己以及父类的方法
        Method[] publicMethods = apple.getClass().getMethods();
        //获取自己的方法
        Method[] allMethods = apple.getClass().getDeclaredMethods();
        /**
         * 获取某个类的指定方法，应为方法方法有重载且参数有很多，
         * 所以第二个参数后开始会有很多。对应方法的参数类型。
         */
        try {
            apple.getClass().getMethod("setColor", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        for(Method method : publicMethods){
            System.out.println(method.getName());
        }
        System.out.println();
        for (Method method : allMethods){
            System.out.println(method.getName());
        }
    }
}
