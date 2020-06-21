package com.synchronizedDemo;

public class Demo1 implements Runnable {
    static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo1=new Demo1();
        Thread thread1 = new Thread(demo1, "demo1");
        Thread thread2 = new Thread(demo1, "demo1");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(a);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            ++a;
        }
    }
}
