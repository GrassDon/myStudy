package com.JAVA.DesignPattern.ObserverPattern;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/4/7 14:46
 */
public class SecondObserver implements Observer {

    private Observerable observerable;

    public SecondObserver (Observerable observerable) {
        this.observerable = observerable;
        this.observerable.attach(this);
    }

    @Override
    public void update () {
        System.out.println(observerable.getNum()+2);
    }
}
