package com.study.extendsTest;

/**
 * <p>
 * 说明：继承测试
 * <li></li>
 * </p>
 *
 * @author o_0sky
 * @date 2019/8/12 10:31
 */
public class father {
    public Object lastname;
    public Object controy;
    public String sex;

    public father(Object lastname, Object controy, String sex) {
        this.lastname = lastname;
        this.controy = controy;
        this.sex = sex;
    }

    public Object getLastname() {
        return lastname;
    }

    public void setLastname(Object lastname) {
        this.lastname = lastname;
    }

    public Object getControy() {
        return controy;
    }

    public void setControy(Object controy) {
        this.controy = controy;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
