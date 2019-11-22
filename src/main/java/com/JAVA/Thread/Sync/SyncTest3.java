package com.JAVA.Thread.Sync;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/22 15:24
 */
public class SyncTest3 implements Runnable {
    //共享资源变量
    static int count = 0;

    @Override
    public void run() {
        increaseCount();
    }

    private void increaseCount() {
        //这里可以放要同步的变量，也可以是this，也可以是类。
        synchronized (SyncTest3.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + count++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncTest3 syncTest1 = new SyncTest3();
        SyncTest3 syncTest2 = new SyncTest3();
        Thread thread1 = new Thread(syncTest1, "thread1");
        Thread thread2 = new Thread(syncTest2, "thread2");
        thread1.start();
        thread2.start();
    }
}
