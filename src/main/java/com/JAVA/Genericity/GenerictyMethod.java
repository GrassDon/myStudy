package com.JAVA.Genericity;

/**
 * <p>
 * 说明：泛型方法类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 9:49
 */
public class GenerictyMethod {
    public <T> void hello(T t){
        System.out.println(t);
    }

    public static void main (String[] args) {
        GenerictyMethod generictyMethod = new GenerictyMethod();
        generictyMethod.hello("hello");
        generictyMethod.hello(3);
    }
}
