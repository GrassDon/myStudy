package com.JAVA.DesignPattern.FactoryPattern.Factory;

import org.springframework.stereotype.Component;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 10:45
 */
@Component
public class Tiger implements Animal{
    @Override
    public void eat () {
        System.out.println("也吃肉");
    }
}
