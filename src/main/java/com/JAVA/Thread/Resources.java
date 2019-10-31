package com.JAVA.Thread;

/**
 * <p>
 * 说明：资源的生产和销毁类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/25 10:04
 */
public class Resources {
    /*资源序号*/
    private int number = 0;
    /*资源标记*/
    private boolean flag = false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        //先判断标记是否已经生产了，如果已经生产，等待消费；
        if (flag) {
            try {
                wait();//让生产线程等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;//生产一个
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        //将资源标记为已经生产
        flag = true;
        notify();//唤醒在等待操作资源的线程（队列）
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        flag = false;
        notify();
    }
}
