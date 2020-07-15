package com.tt.chapter21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadExecutor
 * 每次只会有一个线程执行，执行完后，放在队列的最后面
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        //SingleThreadExecutor确保任意时刻在任何县城中都只有唯一的任务在运行
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
