package com.thread.test1;

public class DoAddNumber {
    private int orderNumber;
    public synchronized void addNumber(){
        while (orderNumber != Integer.parseInt(Thread.currentThread().getName())){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(orderNumber++);
        this.notifyAll();
    }
}
