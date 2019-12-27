package com.JAVA.Extend;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/27 20:00
 */
public class Father {
    protected void say(){
    }
    public void said(){
        say();
    }
    public static void main (String[] args) {
        Father father = new Father();
        father.said();
    }
}
