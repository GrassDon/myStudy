package com.JAVA.ProxyPattern.StaticProxy;

/**
 * <p>
 * 说明：真正的目标类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 16:31
 */
public class RealSubject implements ISubject{

    @Override
    public void request () {
        System.out.println("执行request方法。。。");
    }

    @Override
    public void response () {
        System.out.println("执行response方法。。。");
    }
}
