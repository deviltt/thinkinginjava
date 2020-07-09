package com.designpattern.singleton;

public class Singleton1 {
    //1.构造器私有化
    private Singleton1() {

    }

    private static volatile Singleton1 singleton1;

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
