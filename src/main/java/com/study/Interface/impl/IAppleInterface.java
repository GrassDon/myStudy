package com.study.Interface.impl;

import com.study.Interface.AppleInterface;
import com.study.model.Apple;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/2 10:27
 */
public class IAppleInterface implements AppleInterface {
    @Override
    public void information(Apple apple) {
        System.out.println("信息是："+ apple.toString());
    }
}
