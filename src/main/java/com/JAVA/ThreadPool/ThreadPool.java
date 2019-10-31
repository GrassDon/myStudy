package com.JAVA.ThreadPool;

import com.JAVA.Thread.Passengers;
import com.JAVA.Thread.Resources;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
    public static void main (String[] args) {
        Resources resource = new Resources();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        threadPoolExecutor.submit(new Producers(resource));
        threadPoolExecutor.submit(new Consumers(resource));
    }
}
