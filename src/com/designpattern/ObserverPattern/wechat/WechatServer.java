package com.designpattern.ObserverPattern.wechat;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observed {
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        //携带我的推送内容，告诉那些注册的用户
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(message);
        }
    }

    /**
     *   被观察的行为:推送微信消息
     *   当我推送了新消息后，便会调用notify方法进行通知，通知那些已经注册的用户
     */
    public void setInformation(String message){
        this.message = message;
        System.out.println("微信推送的消息为：" + message);
        notifyAllObserver();
    }
}
