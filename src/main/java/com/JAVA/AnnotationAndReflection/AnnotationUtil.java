package com.JAVA.AnnotationAndReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 说明：注解解析工具类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 14:09
 */
public class AnnotationUtil {

    public static <T> List<MyAnnotationDto> getMyAnnotationDtoList(Class<T> c) {
        if (c == null) {
            return Collections.emptyList();
        }
        try {
            //T cls = c.newInstance();
            Field[] fields = c.getDeclaredFields();
            Method[] methods = c.getDeclaredMethods();
            List<MyAnnotationDto> fixedVoList = new LinkedList<MyAnnotationDto>();
            for (Field field : fields) {
                MyAnnotation desc = field.getAnnotation(MyAnnotation.class);
                if (desc != null) {
                    MyAnnotationDto vo = new MyAnnotationDto();
                    vo.setName(desc.name());
                    vo.setValue(desc.value());
                    fixedVoList.add(vo);
                }
            }
            return fixedVoList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
