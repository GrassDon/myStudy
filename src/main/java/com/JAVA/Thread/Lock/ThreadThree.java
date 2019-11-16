package com.JAVA.Thread.Lock;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 16:55
 */
public class ThreadThree implements Runnable{
    //SpinLock spinLock = new SpinLock();
    @Override
    public void run () {
        //spinLock.lock();
        try {
            System.out.println("3处理业务。。。");
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //spinLock.unlock();
    }
}
