package com.interviewpreparing;

/**
 * 问：为什么flag变量加了volatile关键字后，就可以正常退出程序呢？？
 * 答：
 */
public class VolatileTest extends Thread {
    private boolean flag=false;
//    private volatile boolean flag=false;
    private int i=0;

    @Override
    public void run() {
        while (!flag){
            ++i;
        }
    }

    public static void main(String[] args) {
        VolatileTest volatileTest=new VolatileTest();
        volatileTest.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        volatileTest.flag=true;
        System.out.println("i = "+volatileTest.i);
    }
}
