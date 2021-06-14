package com.thread.demo1;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 准备屏障，当指定数目的人调用 barrier.await() 方法后开始执行线程
 * 否则，那些线程都会阻塞
 */
public class Demo4 {
    private static void demo4() throws Exception {
        CyclicBarrier barrier = new CyclicBarrier(3);
        Random random = new Random();
        for (int threadName = 'A'; threadName <= 'C'; threadName++) {
            String person = String.valueOf(threadName);
            new Thread(() -> {
                long prepareTime = random.nextInt(10000) + 100;
                try {
                    Thread.sleep(prepareTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(person + "准备完毕，等待其他人");
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(person + "开始起跑");
            }).start();
        }
    }

    public static void main(String[] args) throws Exception {
        demo4();
    }
}
