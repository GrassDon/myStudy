package com.JAVA.DesignPattern.SingletonPattern;

/**
 * <p>
 * 说明：懒汉模式，存在线程安全问题。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 13:25
 */
public class LazyLoading {
    private static LazyLoading instance;
    private LazyLoading(){}
    //加锁可以结局线程安全问题，没必要
    public static synchronized LazyLoading getInstance(){
        if(instance == null){
            return new LazyLoading();
        }
        return instance;
    }
}
