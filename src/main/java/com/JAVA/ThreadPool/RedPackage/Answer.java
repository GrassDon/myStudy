package com.JAVA.ThreadPool.RedPackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 说明：应答方法
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/1/10 15:49
 */
public class Answer {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    public void write(){

    }
}
