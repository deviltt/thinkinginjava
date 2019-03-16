package com.thread.test1;

public class Test {
    public static void main(String[] args) {
        OrderNumber orderNumber = new OrderNumber(new DoAddNumber());
        Thread thread[] = new Thread[10];
        for (int i = 0; i < thread.length; i++) {
            thread[i] = new Thread(orderNumber, "" + i);
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}
