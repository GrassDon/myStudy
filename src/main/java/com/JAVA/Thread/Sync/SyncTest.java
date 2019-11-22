package com.JAVA.Thread.Sync;

/**
 * <p>
 * 说明：对象锁（方法锁）同步测试，此示例为非线程安全，因为new了两个不同的对象，每个对象都拥有
 *      不同的锁，就好比一个房间有两个门，钥匙发给不同的人，肯定不安全。
 *
 *      若想线程安全，可以只创建一个线程对象。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/22 13:37
 */
public class SyncTest implements Runnable{
    //共享资源变量，如果是单个实例，则不需要添加static修饰。
    static int count = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+count++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncTest syncTest1 = new SyncTest();
        //可以只new一个。
        SyncTest syncTest2 = new SyncTest();
        Thread thread1 = new Thread(syncTest1,"thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
    }
}
