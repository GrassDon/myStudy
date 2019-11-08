package com.JAVA.ProxyPattern.StaticProxy;

/**
 * <p>
 * 说明：代理实现类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 16:33
 */
public class ProxySubject implements ISubject {

    private ISubject iSubject;

    public ProxySubject (ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void request () {
        System.out.println("before 前置增强方法。。。");
        iSubject.request();
        System.out.println("after 后置增强方法。。。");
    }

    @Override
    public void response () {
        System.out.println("before 前置增强方法。。。");
        iSubject.response();
        System.out.println("after  后置增强方法。。。");
    }
}
