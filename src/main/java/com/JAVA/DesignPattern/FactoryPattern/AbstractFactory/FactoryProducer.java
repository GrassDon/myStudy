package com.JAVA.DesignPattern.FactoryPattern.AbstractFactory;

/**
 * <p>
 * 说明：抽象工厂模式简单说就是以前只是产品由工厂创建，现在工厂也由工厂创建了。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 11:17
 */
public class FactoryProducer {
    public AbstractFactory getFactory(Class<? extends AbstractFactory> factoryClass){
        try {
            return factoryClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
