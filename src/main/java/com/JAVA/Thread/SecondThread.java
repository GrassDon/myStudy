package com.JAVA.Thread;

import jdk.internal.dynalink.beans.StaticClass;

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
    static int i = 0;
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
            System.out.println(i++);
        }
    }
}
