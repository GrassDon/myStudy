package com.JAVA.Thread;

/**
 * <p>
 * 说明：乘客购票类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 16:40
 */
public class Passengers {
    //乘客姓名
    String name;
    //票数
    int num;


    public Passengers (String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getNum () {
        return num;
    }

    public void setNum (int num) {
        this.num = num;
    }
}
