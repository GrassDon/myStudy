package com.JAVA.Genericity;

/**
 * <p>
 * 说明：泛型接口测试类
 * 泛型接口的好处：
 * 使用：需要在实例化时指定类型
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/30 16:47
 */
public interface GenericttyInterfaceTest<T> {
    public T write(T t);
}
