package com.JAVA.Genericity;

/**
 * <p>
 * 说明：人类基类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/30 16:52
 */
public class Human {
    String name;
    String sex;
    int age;

    public Human (String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}
