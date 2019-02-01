package com.tt.chapter21.concurrency;

public class LiftOff implements Runnable {
    protected int countDown = 10;
    //taskCount是静态作用域，只有一份
    private static int taskCount = 0;
    //当只有一个线程时，id=0，当有两个线程时，id=1，此时taskCount=2
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.printf(status());
            Thread.yield();
        }
        System.out.println();
    }
}
