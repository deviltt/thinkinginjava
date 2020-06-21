package com.synchronizedDemo;

public class SynchronizedObjectCodeBlock2 implements Runnable {
    static SynchronizedObjectCodeBlock2 synchronizedObjectCodeBlock2 = new SynchronizedObjectCodeBlock2();

    Object object1 = new Object();
    Object object2 = new Object();

    @Override
    public void run() {
        synchronized (object1) {
            try {
                System.out.println("我是lock1。我叫" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " lock1运行结束。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (object2) {
            try {
                System.out.println("我是lock2。我叫" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " lock2运行结束。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(synchronizedObjectCodeBlock2);
        Thread thread2 = new Thread(synchronizedObjectCodeBlock2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("主线程执行完毕");
    }
}
