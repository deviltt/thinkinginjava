package com.designpattern.factorypattern;

public class BwmCar implements Car {
    @Override
    public void createCar() {
        System.out.println("开宝马车");
    }
}
