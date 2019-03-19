package com.thread.test1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 开启20个线程，完成变量自增到200000的操作
 */
public class CasTest1 {
//    private static volatile int increment = 0;
    private static AtomicInteger atomicInteger=new AtomicInteger(0);
    private static final int THREAD_NUM = 20;

    private static void increase() {
        atomicInteger.getAndAdd(1);
    }

    public static void main(String[] args) {
        Thread[] thread = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        increase();
                    }
                }
            });
            thread[i].start();
        }
        while (Thread.activeCount() > 1)
            Thread.yield();
        System.out.println(atomicInteger.get());
    }
}
