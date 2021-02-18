package com.designpattern.jdkobserver;

import java.util.Observable;

public class BigNew extends Observable {
    public void broadcast(String event) {
        setChanged();
        System.out.println("发布大新闻：" + event);
        notifyObservers(event);
    }

    public void broadcast1(String event) {
        System.out.println("发布内部新闻：" + event);

        notifyObservers(event);
    }
}
