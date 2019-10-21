package com.JAVA.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 说明：线程
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/30 14:46
 */
public class MyFirstThread extends Thread{
    int anInt;

    public MyFirstThread (int anInt) {
        this.anInt = anInt;
    }

    @Override
    public void run(){
        System.out.println("--------" + anInt);
    }

    public static void main (String[] args) {
        List<Thread> list = new ArrayList<>();
        for(int i = 0;i<9;i++){
            MyFirstThread myFirstThread = new MyFirstThread(i);
            myFirstThread.setName(""+ i +"");
            //myFirstThread.setPriority(i+1);
            list.add(myFirstThread);
        }
        MyFirstThread joinThread = new MyFirstThread(100);
        for(Thread thread : list){
            if(thread.getName().equalsIgnoreCase("6")){
                try {
                    joinThread.start();
                    joinThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            thread.start();
        }
    }
}
