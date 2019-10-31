package com.JAVA.Thread;

/**
 * <p>
 * 说明：一个线程不安全的实例，可以改成线程安全的
 *      如果在run前面添加synchronized字段，会导致某个实例方法一直持有锁，
 *      执行持续到num为0为止。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 15:28
 */
public class FifthThread extends Thread {
    static int num = 10;
    @Override
    public synchronized void run () {
            while (num>0) {
                    try {
                        //模拟网络延迟
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + "抢到了第"
                                + num-- + "号车票");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    public static void main(String[] args) {
        //创建三个线程，模拟三个人抢票
        Runnable count= new FifthThread();
        new Thread(count,"A").start();
        new Thread(count,"B").start();
        new Thread(count,"C").start();
    }
}
