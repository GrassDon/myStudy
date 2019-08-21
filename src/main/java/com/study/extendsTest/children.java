package com.study.extendsTest;

import org.apache.ibatis.annotations.Arg;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/8/12 10:33
 */
public class children extends father {

    private String lastname;

    private String controy;

    private String sex;

    private String hobby;

    public children(Object lastname, Object controy, String sex) {
        super(lastname, controy, sex);
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getControy() {
        return controy;
    }

    public void setControy(String controy) {
        this.controy = controy;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args){
        children children = new children("dong","china","nan");

        System.out.println();
    }
}
