package com.study.strategyPattern;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;

/**
 * <p>
 * 说明：算数策略类
 * <li></li>
 * </p>
 *
 * @author DON
 * @date 2019/8/20 21:07
 */
public class MathStrategy {
    Math math;

    MathStrategy(Math math) {
        this.math = math;
    }
    void domath(int a,int b){
        System.out.println(math.calculate(a,b));
    }
}
