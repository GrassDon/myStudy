package com.JAVA.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/22 20:08
 */
//使用CountDownLatch判断线程是否执行完成
public class FixedThreadPoolTestOfCountDownLatch {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for(int i=0;i<10;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("线程名称"+Thread.currentThread().getName());
                        Thread.sleep(1000*3);
                        System.out.println("线程名称"+Thread.currentThread().getName()+"结束");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        //计数器减一
                        countDownLatch.countDown();
                    }
                }
            });
        }
        try {
            //等待所有线程执行结束
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始关闭线程池");
        executorService.shutdown();
        System.out.println("线程池关闭完成");

    }
}