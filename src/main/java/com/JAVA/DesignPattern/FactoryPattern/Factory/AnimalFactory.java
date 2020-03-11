package com.JAVA.DesignPattern.FactoryPattern.Factory;

import com.JAVA.DesignPattern.FactoryPattern.AbstractFactory.AbstractFactory;

/**
 * <p>
 * 说明：动物工厂，用来生产动物
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 9:59
 */
public class AnimalFactory extends AbstractFactory {
    /**
     * 这种方式需要在每次有一个新类（动物）产生时，新增一个if else，
     * 每次都要改动工厂里的逻辑，比较麻烦，同时也违背了开闭原则
     * @param animalType
     * @return
     */
    public Animal productAnimal(String animalType){
        if(null == animalType){
            return null;
        }
        if("DOG".equalsIgnoreCase(animalType)){
            return new Dog();
        } else if("WOLF".equalsIgnoreCase(animalType)){
            return new Wolf();
        } else if("SHEEP".equalsIgnoreCase(animalType)){
            return new Sheep();
        }
        return null;
    }




    /**
     * 这种方式提升了程序拓展性，工厂类后续不需要添加任何更改，在新增类（动物）后，
     * 只需要让该类实现相应接口即可，符合开闭原则。
     * @param animalClass
     * @return
     */
    public Animal productAnimalByClass(Class<? extends Animal> animalClass){
        try {
            return animalClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Animal createAnimal (Class<? extends Animal> animalClass) {
        try {
            return animalClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Food createFood (Class<? extends Food> foodClass) {
        return null;
    }
}
