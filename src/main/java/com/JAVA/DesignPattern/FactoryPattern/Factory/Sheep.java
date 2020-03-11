package com.JAVA.DesignPattern.FactoryPattern.Factory;

/**
 * <p>
 * 说明：羊类，实现动物接口
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 9:53
 */
public class Sheep implements Animal {
    @Override
    public void eat () {
        System.out.println("吃草");
    }
}
