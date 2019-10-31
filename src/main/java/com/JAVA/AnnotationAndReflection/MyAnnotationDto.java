package com.JAVA.AnnotationAndReflection;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 14:10
 */
public class MyAnnotationDto {
    String name;
    String value;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getValue () {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
    }

    @Override
    public String toString () {
        return "MyAnnotationDto{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
