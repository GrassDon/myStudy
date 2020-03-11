package com.study;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/2/27 16:40
 */
public class Person {
    private String name;
    private String sex;

    public Person (String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    public Person () {
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSex () {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
