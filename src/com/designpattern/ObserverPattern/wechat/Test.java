package com.designpattern.ObserverPattern.wechat;

public class Test {
    public static void main(String[] args) {
        WechatServer wechatServer=new WechatServer();

        Observer observer1=new User("桃子");
        Observer observer2=new User("梨子");
        Observer observer3=new User("苹果");

        wechatServer.registerObserver(observer1);
        wechatServer.registerObserver(observer2);
        wechatServer.registerObserver(observer3);

        wechatServer.setInformation("PHP是最好的语言");
        System.out.println();
        wechatServer.removeObserver(observer2);
        wechatServer.setInformation("Java是最好的语言");
    }
}
