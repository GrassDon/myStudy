package com.JAVA.DesignPattern.FactoryPattern.Factory;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 11:00
 */
public class Meat implements Food{
    @Override
    public void category () {
        System.out.println("肉");
    }
}
