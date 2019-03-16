package com.thread.test1;

public class OrderNumber implements Runnable{
    DoAddNumber doAddNumber;

    public OrderNumber(DoAddNumber doAddNumber) {
        this.doAddNumber = doAddNumber;
    }

    @Override
    public void run() {
        doAddNumber.addNumber();
    }
}
