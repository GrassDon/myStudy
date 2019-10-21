package com.JAVA.Thread;

import net.sf.ehcache.util.NamedThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 说明：线程池
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/8 15:06
 */
public class MySecondThreadPool {
    public static void main (String[] args) {
        ThreadFactory nameFactory = new NamedThreadFactory("MyTestThread");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                //只有两个线程，如果任务数超过这两个，也始终是这两个执行
                2,
                4,
                1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10),
                nameFactory
        );
        threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());
    }
}
