package com.thread.demo1;

/**
 * A执行一次后调用wait释放锁，然后等待lock.notify通知后重新获得锁
 */
public class Demo2 {
    private static void demo2() {
        Object lock = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("A 1");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A 2");
                    System.out.println("A 3");
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("B 1");
                    System.out.println("B 2");
                    System.out.println("B 3");
                    lock.notify();
                }
            }
        });
        threadA.start();
        threadB.start();
    }

    public static void main(String[] args) {
        demo2();
    }
}
