package com.JAVA.ThreadPool;

import com.JAVA.Thread.Passengers;
import com.JAVA.Thread.Resources;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 说明：线程池
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 18:35
 */
public class ThreadPool {
    Resources resource = new Resources();
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    ReentrantLock reentrantLock = new ReentrantLock();
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.next());
        if("2".equals(scan.next())){
            threadPoolExecutor.submit(new Producers(resource));
            threadPoolExecutor.submit(new Consumers(resource));
        }
        else {
            System.out.println("输入错误");
        }
    }

    public static void main (String[] args) {
        ThreadPool threadPool = new ThreadPool();
        threadPool.start();
    }
}
