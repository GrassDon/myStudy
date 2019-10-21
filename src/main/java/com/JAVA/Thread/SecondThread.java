package com.JAVA.Thread;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/8 14:35
 */
public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
