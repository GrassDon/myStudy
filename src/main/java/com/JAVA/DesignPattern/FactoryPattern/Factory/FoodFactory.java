package com.JAVA.DesignPattern.FactoryPattern.Factory;

import com.JAVA.DesignPattern.FactoryPattern.AbstractFactory.AbstractFactory;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 11:00
 */
public class FoodFactory extends AbstractFactory {
    public Food productFoodByClass(Class<? extends Food> foodClass){
        try {
            return foodClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Animal createAnimal (Class<? extends Animal> animalClass) {
        return null;
    }

    @Override
    public Food createFood (Class<? extends Food> foodClass) {
        try {
            return foodClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
