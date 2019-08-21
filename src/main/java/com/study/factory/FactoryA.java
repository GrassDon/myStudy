package com.study.factory;

/**
 * <p>
 * 说明：具体工厂类A
 * <li></li>
 * </p>
 *
 * @author DON
 * @date 2019/8/21 10:47
 */
public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
