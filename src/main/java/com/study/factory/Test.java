package com.study.factory;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/21 10:54
 */
public class Test {
    public static void main(String[] args){
        Factory productFactory = new FactoryA();
        productFactory.createProduct().show();
    }
}
