package com.study.strategyPattern;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/20 21:07
 */
public class sub implements Math {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
