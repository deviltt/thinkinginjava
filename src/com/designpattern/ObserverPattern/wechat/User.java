package com.designpattern.ObserverPattern.wechat;

//具体的观察者
public class User implements Observer{
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + "收到推送消息："+message);
    }
}
