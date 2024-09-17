package com.test;

import com.study.Interface.AppleInterface;
import com.study.Interface.impl.IAppleInterface;
import com.study.model.Apple;

/**
 * <p>
 * 说明：测试方法
 * <li></li>
 * </p>
 *
 * @author dong
 * @date 2019/8/2 10:31
 */
public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple(23,"red");
        AppleInterface appleInterface = new IAppleInterface();
        appleInterface.information(apple);
        int j=3;
        for(int i=0;i<10;i++){
            if(j==i){
                System.out.println(i);
            }
            else if(i==4){
                System.out.println(4);
            }
            else if(1==1){
                System.out.println("true");
            }
        }
    }
}
