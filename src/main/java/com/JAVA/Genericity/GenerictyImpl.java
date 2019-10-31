package com.JAVA.Genericity;

/**
 * <p>
 * 说明：泛型接口实现类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/30 17:15
 */
public class GenerictyImpl implements GenericttyInterfaceTest<String> {
    @Override
    public String write (String s) {
        return s;
    }
}
