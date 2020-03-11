package com.JAVA.DesignPattern.ProxyPattern;


/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 14:58
 */
public class TestMain {
    public static void main (String[] args) {
        Performer performer = new Agent();
        performer.sing();
    }
}
