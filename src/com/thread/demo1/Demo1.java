package com.thread.demo1;

/**
 * B等待A线程执行完任务后开始执行
 */
public class Demo1 {
    private static void demo1() {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B开始等待A");
                try {
                    threadA.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("B");
            }
        });
        threadA.start();
        threadB.start();
    }

    private static void printNumber(String threadName) {
        int i = 0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }

    public static void main(String[] args) {
        demo1();
    }
}
