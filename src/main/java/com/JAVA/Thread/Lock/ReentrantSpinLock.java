package com.JAVA.Thread.Lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * 说明：自旋锁（可重入）
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 18:35
 */
public class ReentrantSpinLock {
    private AtomicReference cas = new AtomicReference();

    private int count;

    public void lock() {
        Thread current = Thread.currentThread();
        /**
         * 如果当前线程已经获取过该锁，且再一次要获取该锁，
         * 那么将计数器加一，但是如果是其他线程获取该锁，
         * 则不允许，所以可重入锁的目标对象是当前线程本身
         */
        if (current == cas.get()) { // 如果当前线程已经获取到了锁，线程数增加一，然后返回
            count++;
            return;
        }
        // 如果没获取到锁，则通过CAS自旋
        while (!cas.compareAndSet(null, current)) {

        }
    }

    public void unlock() {
        Thread cur = Thread.currentThread();
        if (cur == cas.get()) {
            if (count > 0) {// 如果大于0，表示当前线程多次获取了该锁，释放锁通过count减一来模拟
                count--;
            } else {// 如果count==0，可以将锁释放，这样就能保证获取锁的次数与释放锁的次数是一致的了。
                cas.compareAndSet(cur, null);
            }

        }

    }

}
