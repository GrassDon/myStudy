package com.study.strategyPattern;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/20 20:46
 */
public class ColorStrategy {
    Color color;

    ColorStrategy(Color color) {
        this.color = color;
    }

    void getColor() {
        color.dosomething();
    }
}
