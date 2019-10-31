package com.JAVA.AnnotationAndReflection;

import java.util.List;

/**
 * <p>
 * 说明：获取注解内容测试类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 14:51
 */
public class Test {
    public static void main (String[] args) {
        List<MyAnnotationDto> voList = AnnotationUtil.getMyAnnotationDtoList(Man.class);
        for (MyAnnotationDto vo : voList) {
            System.out.println(vo.toString());
        }
    }
}
