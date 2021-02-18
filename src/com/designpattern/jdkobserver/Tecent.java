package com.designpattern.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class Tecent implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("腾讯收到消息：" + arg);
    }
}
