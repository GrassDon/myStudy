package com.JAVA.Thread.Lock;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 16:17
 */
public class ThreadOne implements Runnable{
    //不能用这种方法加锁，因为这样创建的是新的一把锁，所以不会出现竞争锁的情况
    //SpinLock spinLock = new SpinLock();
    @Override
    public void run () {
        //spinLock.lock();
        try {
            System.out.println("1处理业务。。。");
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //spinLock.unlock();
    }
}
