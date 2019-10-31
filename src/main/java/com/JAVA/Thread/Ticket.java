package com.JAVA.Thread;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 说明：售票系统模拟(线程安全测试)
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 15:56
 */
public class Ticket {
    //票数
    int num;

    public Ticket (int num) {
        this.num = num;
    }
    public Ticket(){

    }
    //买票方法
    public synchronized int sell(Passengers passengers) throws InterruptedException {
        if(num<1){
            System.out.println(passengers.name+"先生/女士:很抱歉，当前无票");
            return 0;
        }
        System.out.println(passengers.name+"先生/女士:"+"您当前的票号为: "+num+"。");
        num--;
        return num;
    }

    public static void main (String[] args) {
        Ticket ticket = new Ticket(3);
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
