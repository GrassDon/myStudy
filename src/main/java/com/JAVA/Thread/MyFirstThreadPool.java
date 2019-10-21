package com.JAVA.Thread;

import net.sf.ehcache.util.NamedThreadFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import javax.naming.Name;
import java.util.concurrent.*;

/**
 * <p>
 * 说明：线程池
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/30 10:52
 */
public class MyFirstThreadPool {
    private ThreadPoolExecutor threadPoolExecutor;

    /**
     * 有界的任务队列可以使用ArrayBlockingQueue实现
     * @description 使用ArrayBlockingQueue有界任务队列，若有新的任务需要执行时，
     *              线程池会创建新的线程，直到创建的线程数量达到corePoolSize时，则会将新的任务加入到等待队列中。
     *              若等待队列已满，即超过ArrayBlockingQueue初始化的容量，则继续创建线程，
     *              直到线程数量达到maximumPoolSize设置的最大线程数量，若大于maximumPoolSize，则执行拒绝策略。
     *              在这种情况下，线程数量的上限与有界任务队列的状态有直接关系，如果有界队列初始容量较大或者没有达到超负荷的状态，
     *              线程数将一直维持在corePoolSize以下，反之当任务队列已满时，则会以maximumPoolSize为最大线程数上限。
     */
    public void ArrayBlockingQueue() {
        ThreadFactory nameFactory = new NamedThreadFactory("MyTestThread");
        threadPoolExecutor = new ThreadPoolExecutor(
                //只有两个线程，如果任务数超过这两个，也始终是这两个执行
                3,
                4,
                1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10),
                nameFactory
        );
        for(int i=0;i<10;i++) {
            String name = String.valueOf(i);
            ThreadTask task = new ThreadTask(name);
            threadPoolExecutor.execute(task);
        }
    }

    public class ThreadTask extends Thread implements Runnable{

        private String name;

        public ThreadTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" : name : "+name);
        }
    }

    public static void main (String[] args) {
        MyFirstThreadPool myFirstThreadPool = new MyFirstThreadPool();
        myFirstThreadPool.ArrayBlockingQueue();
    }
}
