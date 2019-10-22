package com.JAVA.Thread;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/22 20:29
 */
public class ThirdThread extends Thread {
    @Override
    public void run(){
        for(int i = 10; i < 20 ; i ++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
