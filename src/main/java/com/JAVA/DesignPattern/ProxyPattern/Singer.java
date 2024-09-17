package com.JAVA.DesignPattern.ProxyPattern;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 14:54
 */
public class Singer implements Performer{
    @Override
    public void sing () {
        System.out.println("sing a song");
    }

    @Override
    public void dance () {
        System.out.println("dance");
    }
}
