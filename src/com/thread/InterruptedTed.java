package com.thread;

import java.util.concurrent.TimeUnit;

public class InterruptedTed {
    public static void main(String[] args) {
        System.out.println("Main thread is interrupted? " + Thread.interrupted());

        Thread.currentThread().interrupt();

        //这里使用isInterrupted是因为interrupted在线程被打断的第一次调用会返回true，之后都只会返回false
        System.out.println("Main thread is interrupted? " + Thread.currentThread().isInterrupted());

        try {
            TimeUnit.MINUTES.sleep(1);  //提前中断后，再执行可中断方法会立即中断
        } catch (InterruptedException e) {
            System.out.println("I will be interrupted still.");
        }
    }
}
