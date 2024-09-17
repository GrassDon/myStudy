package com.JAVA.Thread.Lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * 说明：自旋锁（不可重入）
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 17:32
 */
public class SpinLock {

    private AtomicReference cas = new AtomicReference();

    public void lock() {
        Thread current = Thread.currentThread();
        // 利用CAS
        while (!cas.compareAndSet(null, current)) {
            System.out.println(current.getName()+"正在自旋。。。");
        }
        System.out.println(current.getName()+"获取到锁");
    }

    public void unlock() {
        Thread current = Thread.currentThread();
        cas.compareAndSet(current, null);
        if(!cas.compareAndSet(current, null)){
            System.out.println(current.getName()+"释放锁");
        }
    }
}
