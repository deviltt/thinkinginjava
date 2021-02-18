package com.designpattern.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class Alibaba implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("阿里巴巴收到消息：" + arg);
    }
}
