package com.JAVA.DesignPattern.SingletonPattern;

import com.JAVA.DesignPattern.FactoryPattern.Factory.Dog;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 13:13
 */
public class TestMain {
    public static void main (String[] args) {
        /**
         * 证明单例
         */
        SingleObject singleObject1 = SingleObject.getInstance();
        SingleObject singleObject2 = SingleObject.getInstance();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(singleObject1.hashCode());
        System.out.println(singleObject2.hashCode());
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
    }
}
