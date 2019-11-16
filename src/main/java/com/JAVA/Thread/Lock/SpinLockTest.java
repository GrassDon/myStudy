package com.JAVA.Thread.Lock;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/11/16 17:12
 */
public class SpinLockTest {

    private AtomicBoolean available = new AtomicBoolean(false);

    public void lock(){

        // 循环检测尝试获取锁
        while (!tryLock()){
            // doSomething...
            System.out.println("没获取到锁，所以在自旋。。。");
        }

    }

    public boolean tryLock(){
        // 尝试获取锁，成功返回true，失败返回false
        return available.compareAndSet(false,true);
    }

    public void unLock(){
        if(!available.compareAndSet(true,false)){
            throw new RuntimeException("释放锁失败");
        }
    }

}
