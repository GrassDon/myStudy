package com.JAVA.ThreadPool;

import com.JAVA.Thread.Resources;

/**
 * <p>
 * 说明：消费者
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/24 18:31
 */
public class Consumers implements Runnable{

    private Resources resource;

    public Consumers(Resources resource) {
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
            resource.destroy();
        }

    }
}
