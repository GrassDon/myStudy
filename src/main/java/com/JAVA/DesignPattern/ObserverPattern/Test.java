package com.JAVA.DesignPattern.ObserverPattern;

/**
 * <p>
 * 说明：观察者模式测试类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/4/7 14:38
 */
public class Test {
    public static void main (String[] args) {
        Observerable observerable = new Observerable();
        FirstObserver firstObserver = new FirstObserver(observerable);
        SecondObserver secondObserver = new SecondObserver(observerable);

        observerable.setNum(0);
        observerable.setNum(10);
    }

}
