package com.JAVA.ProxyPattern.DynamicProxy;

import com.JAVA.ProxyPattern.StaticProxy.ISubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 19:31
 */
public class DynamicProxySubject implements InvocationHandler {
    private ISubject iSubject;

    public DynamicProxySubject(ISubject subject) {
        this.iSubject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before 前置通知");
        Object result = null;

        try {
            result = method.invoke(iSubject, args);
        }catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        }finally {
            System.out.println("after 后置通知");
        }
        return result;
    }
}
