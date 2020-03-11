package com.JAVA.Thread.Lock;

import com.JAVA.Thread.Passengers;
import com.JAVA.Thread.Ticket;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 说明：测试reentranlock锁
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/2/19 13:33
 */
public class LockTicket {
    //票数
    int num;

    //可重入锁
    ReentrantLock reentrantLock = new ReentrantLock();

    public LockTicket (int num) {
        this.num = num;
    }
    public LockTicket(){

    }
    //买票方法
    public int sell(Passengers passengers) {
        System.out.println(reentrantLock.getQueueLength());
        System.out.println(reentrantLock.isFair());
        reentrantLock.lock();
        try {
            if (num < 1) {
                System.out.println(passengers.getName() + "先生/女士:很抱歉，当前无票");
                return 0;
            }
            System.out.println(passengers.getName() + "先生/女士:" + "您当前的票号为: " + num + "。");
            num--;
            return num;
        }
        finally {
            reentrantLock.unlock();
        }

    }

    public static void main (String[] args) {
        Ticket ticket = new Ticket(4);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,
                3,
                5000,
                TimeUnit.MILLISECONDS,
                //非阻塞队列，理论上大小不限，实际最大值为int.max
                new LinkedBlockingQueue<>()
        );
        HashMap<String,Passengers> passengersHashMap = new HashMap<>(10);
        passengersHashMap.put("001",new Passengers("dong",1));
        passengersHashMap.put("002",new Passengers("lin",1));
        passengersHashMap.put("003",new Passengers("su",1));
        passengersHashMap.put("004",new Passengers("shen",1));
        for (Passengers passenger : passengersHashMap.values()) {
            threadPool.submit(()->ticket.sell(passenger));
        }
    }
}
