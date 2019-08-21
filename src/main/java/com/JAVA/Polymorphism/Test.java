package com.JAVA.Polymorphism;

import java.lang.reflect.Proxy;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/14 20:23
 */
public class Test {
    public static void main(String[] args){
        Man man = new Man("male");
        Class class1 = man.getClass();
        System.out.println(class1.getName());
        Woman woman = new Woman("female");
        Class class2 = woman.getClass();
        System.out.println(class2.getName());
        Human human = new Human();
        Class class3 = human.getClass();
        System.out.println(class3.getName());

        
        Human woman2 = new Woman("female");
        Class classw = woman2.getClass();
        System.out.println(classw.getName());
    }
}
