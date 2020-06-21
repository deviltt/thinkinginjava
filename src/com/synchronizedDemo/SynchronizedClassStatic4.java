package com.synchronizedDemo;

public class SynchronizedClassStatic4 implements Runnable{
    static SynchronizedClassStatic4 instance1 = new SynchronizedClassStatic4();
    static SynchronizedClassStatic4 instance2 = new SynchronizedClassStatic4();

    public static void main(String[] args) throws InterruptedException {
        //两个是不同的实例
        Thread thread1 = new Thread(instance1, "instance1");
        Thread thread2 = new Thread(instance2,"instance2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("主线程执行完毕");
    }

    @Override
    public void run() {
        synchronized (SynchronizedClassStatic4.class) {
            try {
                System.out.println("我是class类锁。我叫" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " class类锁运行结束。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
