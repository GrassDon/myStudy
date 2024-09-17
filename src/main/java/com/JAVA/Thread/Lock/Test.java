package com.JAVA.Thread.Lock;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 16:31
 */
public class Test {
    public static void main (String[] args) {

        //创建一把自旋锁，所有线程公用
        SpinLock spinLock = new SpinLock();

        new Thread(()->{
            spinLock.lock();
            System.out.println(Thread.currentThread().getName()+"\t开始模拟0.5s业务处理");
            try {
                Thread.sleep(500);
                //TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName()+"\t模拟0.5s业务处理完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLock.unlock();
        },"T1").start();

        new Thread(()->{
            spinLock.lock();
            System.out.println(Thread.currentThread().getName()+"\t开始模拟3s业务处理");
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName()+"\t模拟3s业务处理完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLock.unlock();
        },"T2").start();
    }
}
