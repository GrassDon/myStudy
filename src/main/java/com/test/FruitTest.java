package com.test;

import com.study.Interface.AppleInterface;
import com.study.Interface.impl.IAppleInterface;
import com.study.model.Apple;

/**
 * <p>
 * 说明：测试方法
 * <li></li>
 * </p>
 *
 * @author dong
 * @date 2019/8/2 10:31
 */
public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple(23,"red");
        AppleInterface appleInterface = new IAppleInterface();
        appleInterface.information(apple);
    }
}
