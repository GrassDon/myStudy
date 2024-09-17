package com.JAVA.DesignPattern.FactoryPattern.AbstractFactory;

import com.JAVA.DesignPattern.FactoryPattern.Factory.Animal;
import com.JAVA.DesignPattern.FactoryPattern.Factory.Food;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 11:07
 */
public abstract class AbstractFactory {
    public abstract Animal createAnimal(Class<? extends Animal> animalClass);
    public abstract Food createFood(Class<? extends Food> foodClass);
}
