package com.designpattern.ObserverPattern.shop;

public class Test {
    public static void main(String[] args) {
        JingDongObserver jingDongObserver = new JingDongObserver();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        ProductList observable = new ProductList();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        observable.addProduct("tt");
    }
}
