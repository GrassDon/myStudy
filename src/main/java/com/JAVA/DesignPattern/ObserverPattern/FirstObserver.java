package com.JAVA.DesignPattern.ObserverPattern;

/**
 * <p>
 * 说明：第一个观察者
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/4/7 14:39
 */
public class FirstObserver implements Observer {

    private Observerable observerable;

    public FirstObserver (Observerable observerable) {
        this.observerable = observerable;
        //将自己加入到被观察者的记录中，当被观察者更新时，通知此观察者
        this.observerable.attach(this);
    }

    @Override
    public void update () {
        //被观察者更新时，调用注册信息里的所有观察者的方法，其实就是通知观察者，自己发生变化了
        System.out.println(observerable.getNum()+1);
    }
}
