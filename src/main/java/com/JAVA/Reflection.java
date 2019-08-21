package com.JAVA;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author Don
 * @date 2019/8/14 20:01
 */
public class Reflection {
    public static String name = "我是反射";
    static {
        System.out.println("hello! 反射！");
    }

    public Reflection() {
        System.out.println("构造反射！");
    }
}
