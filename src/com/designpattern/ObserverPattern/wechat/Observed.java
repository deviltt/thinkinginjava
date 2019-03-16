package com.designpattern.ObserverPattern.wechat;

//被观察对象
public interface Observed {
    //被观察的对象都会有哪些行为
    //1.注册可以观察我的对象
    void registerObserver(Observer observer);
    //2.移除可以观察我的对象
    void removeObserver(Observer observer);
    //3.通知观察我的对象
    void notifyAllObserver();
}
