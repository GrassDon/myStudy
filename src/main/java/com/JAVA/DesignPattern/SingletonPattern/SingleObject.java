package com.JAVA.DesignPattern.SingletonPattern;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 13:08
 */
public class SingleObject {
    //创建对象，其实是一种饿汉模式，也就是立即加载，不存在线程安全问题
    private static SingleObject instance = new SingleObject();

    //构造函数为私有，不会实例化
    private SingleObject(){}

    //获取实例对象
    public static SingleObject getInstance(){
        return instance;
    }
}
