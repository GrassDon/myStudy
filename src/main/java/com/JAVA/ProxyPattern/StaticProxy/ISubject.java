package com.JAVA.ProxyPattern.StaticProxy;

/**
 * <p>
 * 说明：静态代理主要通过将目标类与代理类实现同一个接口，让代理类持有真实类对象，
 *      然后在代理类方法中调用真实类方法，在调用真实类方法的前后添加我们所需要的
 *      功能扩展代码来达到增强的目的
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 16:24
 */
public interface ISubject {
    void request();
    void response();
}
