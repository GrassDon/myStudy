package com.JAVA.Thread;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 14:39
 */
public class MyFouthThread extends Thread{

    int index = 30;

    @Override
    public synchronized void run(){
        for(int i = 30; i < 40 ; i ++){
            System.out.println(Thread.currentThread().getName()+":"+ index++);
        }
    }
}
