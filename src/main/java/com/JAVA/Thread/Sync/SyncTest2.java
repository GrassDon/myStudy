package com.JAVA.Thread.Sync;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/22 14:03
 */
public class SyncTest2 implements Runnable {
    //共享资源变量
    static int count = 0;
    @Override
    public synchronized void run () {
        increaseCount();
    }

    private synchronized static void increaseCount () {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main (String[] args) throws InterruptedException {
        SyncTest2 syncTest1 = new SyncTest2();
        SyncTest2 syncTest2 = new SyncTest2();
        Thread thread1 = new Thread(syncTest1, "thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
    }
}