package com.JAVA.Polymorphism;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author DON
 * @date 2019/8/14 20:25
 */
public class Woman extends Human{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Woman(String sex) {
        this.sex = sex;
    }
}
