package com.tt.chapter21.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * ADaemon的finally子句不会执行，因为main函数执行完后后台线程就会被强制终止
 */
class ADaemon implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?");  //finally不会执行
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new ADaemon());
        thread.setDaemon(true);     //设置为后台线程
        thread.start();
        thread.sleep(100);
    }
}
