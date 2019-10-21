package com.test;

import com.study.Interface.AppleInterface;
import com.study.Interface.impl.IAppleInterface;
import com.study.model.Apple;
import org.apache.naming.java.javaURLContextFactory;

import java.util.Date;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/2 10:31
 */
public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple(23,"red");
        AppleInterface appleInterface = new IAppleInterface();
        appleInterface.information(apple);
    }
}
