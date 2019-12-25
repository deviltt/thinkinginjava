package com.designpattern.ObserverPattern.basketball;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BasketballFans fans1=new BasketballFans("tt");
        BasketballFans fans2=new BasketballFans("ac");

        BasketballManagement basketballManagement =new BasketballManagement();
        basketballManagement.addObserver(fans1);
        basketballManagement.addObserver(fans2);
        basketballManagement.updateTime(new Date());


        Thread.sleep(3000);
        System.out.println("时间修改了");
        basketballManagement.removeObserver(fans2);
        basketballManagement.updateTime(new Date());
    }
}
