package com.designpattern.ObserverPattern.shop;

import java.util.Observable;

public class ProductList extends Observable {
    //注册商城
    public void addProduct(String newProduct){
        System.out.println("产品列表新增了产品："+newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}
