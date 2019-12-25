package com.designpattern.ObserverPattern.basketball;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasketballFans implements Observer {
    private Date date;
    private String fans;

    public BasketballFans(String fans) {
        this.fans = fans;
    }

    @Override
    public void update(Date date) {
        this.date = date;
        display();
    }

    @Override
    public void display() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("我是爱好者" + fans + "接收到时间" + simpleDateFormat.format(date));
    }
}
