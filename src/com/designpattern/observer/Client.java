package com.designpattern.observer;

public class Client {
    public static void main(String[] args) {
        PoliceObserver observer1=new PoliceObserver();
        PoliceObserver observer2=new PoliceObserver();
        PoliceObserver observer3=new PoliceObserver();

        CriminalObservable observable=new CriminalObservable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.crime("放狗咬人");
    }
}
