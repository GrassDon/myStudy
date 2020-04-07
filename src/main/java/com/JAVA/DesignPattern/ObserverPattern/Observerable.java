package com.JAVA.DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 说明：被观察者（被订阅者或者说公众号）
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/4/7 14:30
 */
public class Observerable {
    //记录所有观察者信息
    private List<Observer> observers = new ArrayList<>();
    private int num ;

    public List<Observer> getObservers () {
        return observers;
    }

    public void setObservers (List<Observer> observers) {
        this.observers = observers;
    }

    public int getNum () {
        return num;
    }

    public void setNum (int num) {
        this.num = num;
        //每当值更新后，通知观察者
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        //调用注册在自己这里的所有观察者的方法，通知观察者，自己更新了
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
