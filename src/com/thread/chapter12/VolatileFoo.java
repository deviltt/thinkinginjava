package com.thread.chapter12;

import java.util.concurrent.TimeUnit;

public class VolatileFoo {
    private final static int MAX = 5;
    private static volatile int init_value = 0;

    public static void main(String[] args) {
        //启动一个reader线程，用于当local_val和init_val不相等时打印
        new Thread(() -> {
            int local_val = init_value;
            while (local_val < MAX) {
                //开始local_val、init_value两个值是相等的，当updater线程将init_value的值改变时，满足if条件，进入if代码块
                if (local_val != init_value) {
                    System.out.println("The init_val is updated to " + init_value);
                    local_val = init_value;
                }
            }
        }, "reader").start();
        //启动一个updater线程，用于修改init_val的值
        new Thread(() -> {
            int local_cal = init_value;
            while (local_cal < MAX) {
                System.out.println("The init_val will be changed to " + ++local_cal);
                init_value = local_cal;
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "updater").start();
    }
}
