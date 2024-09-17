package com.JAVA.Thread.BookNoteOfMultiThreadingCoreTechnology;


/**
 * 当前线程是否处于活动状态。所谓活动状态就是线程已经启动还没终止这段时间。
 */
public class IsAlive extends Thread {
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        IsAlive isAlive = new IsAlive();
        System.out.println("begin="+isAlive.isAlive());
        isAlive.start();
        Thread.sleep(500);
        System.out.println("begin="+isAlive.isAlive());
    }

    /**
     * 结果:
     * begin=false
     * run=true
     * begin=false
     * 说明start之后，执行run就是活动状态。
     */
}
