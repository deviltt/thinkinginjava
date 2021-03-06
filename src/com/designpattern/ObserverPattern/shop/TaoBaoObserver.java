package com.designpattern.ObserverPattern.shop;

import java.util.Observable;
import java.util.Observer;

public class TaoBaoObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.out.println("发布新产品【"+newProduct+"】到淘宝商城");
    }
}
