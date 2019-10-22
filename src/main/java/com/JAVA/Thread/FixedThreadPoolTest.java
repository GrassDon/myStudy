package com.JAVA.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * 说明：定长线程池测试
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/22 18:46
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
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
                    }
                }
            });
        }
        System.out.println("开始关闭线程池，不再接受新任务");
        executorService.shutdown();
        System.out.println("===========");
        //等待所有线程执行完成
        while (!executorService.isTerminated()) {
        }
        System.out.println("线程池关闭完成");
    }
}
