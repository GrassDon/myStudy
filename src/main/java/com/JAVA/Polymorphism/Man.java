package com.JAVA.Polymorphism;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/14 20:24
 */
public class Man extends Human{

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Man(String sex) {
        this.sex = sex;
    }
}
