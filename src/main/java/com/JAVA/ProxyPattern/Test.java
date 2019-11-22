package com.JAVA.ProxyPattern;

import com.JAVA.ProxyPattern.DynamicProxy.DynamicProxySubject;
import com.JAVA.ProxyPattern.StaticProxy.ISubject;
import com.JAVA.ProxyPattern.StaticProxy.ProxySubject;
import com.JAVA.ProxyPattern.StaticProxy.RealSubject;
import com.sun.javaws.Main;
import java.lang.reflect.Proxy;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 16:41
 */
public class Test {
    public static void main (String[] args) {
        /*ISubject realSubject = new RealSubject();
        *//*ISubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
        proxySubject.response();*//*

        DynamicProxySubject dynamicProxySubject = new DynamicProxySubject(realSubject);
        ISubject proxySubject = (ISubject) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{ISubject.class}, dynamicProxySubject);
        proxySubject.request();
        proxySubject.response();*/
    }
}
