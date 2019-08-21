package com.study.factory;

import com.study.Interface.AppleInterface;
import com.study.Interface.impl.IAppleInterface;

/**
 * <p>
 * 说明：水果工厂类
 * <li></li>
 * </p>
 *
 * @author dong
 * @date 2019/8/1 20:05
 */
public class FruitFactory {
    public static AppleInterface getFruit(){
        return new IAppleInterface();
    }
}
