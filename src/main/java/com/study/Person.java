package com.study;

import org.springframework.beans.factory.InitializingBean;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/2/27 16:40
 */
public class Person implements InitializingBean {
    private String name;
    private String sex;

    public Person (String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    public Person () {
    }

    public void initPerson(){
        System.out.println("初始化方法");
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterpropertiesset方法");
    }
}
