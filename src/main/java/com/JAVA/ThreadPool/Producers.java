package com.JAVA.ThreadPool;

import com.JAVA.Thread.Resources;

/**
 * <p>
 * 说明：生产者模型
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 18:23
 */
public class Producers implements Runnable{

    private Resources resource;

    public Producers(Resources resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.create();
        }

    }
}
