package com.JAVA.Thread;

import net.sf.ehcache.util.NamedThreadFactory;
import java.util.concurrent.*;

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
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        /**
         * ThreadPoolExecutor池子的处理流程如下：　　
        1）当池子大小小于corePoolSize就新建线程，并处理请求
        2）当池子大小等于corePoolSize，把请求放入workQueue中，池子里的空闲线程就去从workQueue中取任务并处理
        3）当workQueue放不下新入的任务时，新建线程入池，并处理请求，如果池子大小撑到了maximumPoolSize就用RejectedExecutionHandler来做拒绝处理
        4）另外，当池子的线程数大于corePoolSize的时候，多余的线程会等待keepAliveTime长的时间，如果无请求可处理就自行销毁
        其会优先创建 CorePoolSiz 线程， 当继续增加线程时，先放入Queue中，
         当 CorePoolSiz 和 Queue 都满的时候，就增加创建新线程，当线程达到MaxPoolSize的时候，就会抛出错 误
         org.springframework.core.task.TaskRejectedException
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                //只有两个线程，如果任务数超过这两个，也始终是这两个执行
                2,
                //当线程池中正在运行的线程达到 corePoolSize 个时，线程会放到 taskQueue 中排队等候；
                //但是当请求队列大于maximumpoolsize时，就会执行四个
                /*这个过程，像极了小朋友做客的场景：
                小朋友做客，桌上放了一桌的土豆条，小朋友有一个碗（任务队列 taskQueue），
                碗里可以放10根土豆条（taskQueue容量 = 10），
                正常情况下，小朋友每次可以吃2根土豆条（嘴巴就是线程池，corePoolSize = 2），
                小朋友狼吞虎咽的吃每次可以嘴里塞4根土豆条（maximumPoolSize = 4），但也只能吃2个。
                坐在餐桌边后，小朋友开始吃土豆，先往嘴里放了2根土豆条，但怕其他小朋友和自己抢，
                然后赶紧往自己的碗里加土豆条（加入队列），
                直到碗满了（现在小朋友嘴里2个土豆条，碗里10个土豆条）。小朋友依然害怕因为自己动作慢比其他人少吃，
                但是碗已经满了，所以小朋友开始狼吞虎咽地吃（嘴里同时塞4个土豆条，碗里10个土豆条）。
                此时小朋友已经达到极限了，虽然桌上还有土豆条，
                但是也只能先拒绝了（饱和策略RejectedExecutionHandler），等嘴巴里的土豆条吃完之后，再去取。*/
                3,
                1000,
                TimeUnit.MILLISECONDS,
                //任务队列数
                new ArrayBlockingQueue<>(4),
                nameFactory
        );
        /*threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());
        threadPoolExecutor.submit(new SecondThread());*/

        /**
         * 缓存线程池
         */
        /*cachedThreadPool.submit(new SecondThread());
        cachedThreadPool.submit(new SecondThread());
        cachedThreadPool.submit(new SecondThread());
        cachedThreadPool.submit(new SecondThread());*/

        /**
         * 定长线程池
         */
        fixedThreadPool.submit(new SecondThread());
        fixedThreadPool.submit(new SecondThread());
        fixedThreadPool.submit(new ThirdThread());
    }
}
