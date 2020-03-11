package com.JAVA.DesignPattern.FactoryPattern.Factory;

import com.JAVA.DesignPattern.FactoryPattern.AbstractFactory.AbstractFactory;
import com.JAVA.DesignPattern.FactoryPattern.AbstractFactory.FactoryProducer;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 10:37
 */
public class TestMain {
    public static void main (String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog,sheep,wolf;

        /**
         * 根据名称创建
         */
        dog = animalFactory.productAnimal("dog");
        sheep = animalFactory.productAnimal("sheep");
        wolf = animalFactory.productAnimal("wolf");

        /**
         * 根据类创建
         */
        dog = animalFactory.productAnimalByClass(Dog.class);
        sheep = animalFactory.productAnimalByClass(Sheep.class);
        wolf = animalFactory.productAnimalByClass(Wolf.class);

        dog.eat();
        sheep.eat();
        wolf.eat();


        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory foodFactory = factoryProducer.getFactory(FoodFactory.class);
        AbstractFactory animalFactory1 = factoryProducer.getFactory(AnimalFactory.class);
        Food meat = foodFactory.createFood(Meat.class);
        meat.category();

    }
}
