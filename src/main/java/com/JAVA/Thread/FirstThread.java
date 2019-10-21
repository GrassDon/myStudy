package com.JAVA.Thread;

/**
 * <p>
 * 说明：多线程测试
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/30 10:39
 */
public class FirstThread extends Thread{
    @Override
    public void run(){
        System.out.println(getName("dong"));
    }
    private String getName(String name){
        return name;
    }
    public static void main(String[] args){
        FirstThread firstThread1 = new FirstThread();
        FirstThread firstThread2 = new FirstThread();
        for(int i = 0 ;i < 3; i++){
            firstThread1.run();
            firstThread2.run();
        }
    }
}
