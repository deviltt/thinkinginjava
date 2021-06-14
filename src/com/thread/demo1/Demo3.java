package com.thread.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * countDownLatch.await()调用后，这个线程会阻塞
 * 知道调用了 n 次的 countDownLatch.countDown() 后，才会继续执行
 */
public class Demo3 {
    private static void demo3() {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("D is waiting for other three threads");
                try {
                    countDownLatch.await();
                    System.out.println("all done, D start working");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        for (char threadName = 'A'; threadName <= 'C'; threadName++) {
            final String tn = String.valueOf(threadName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(tn + " is working");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(tn + " finished");
                    countDownLatch.countDown();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        demo3();
    }
}
