package com.designpattern.simplefactorypattern;

public class SportCar implements Car {
    @Override
    public void getCar() {
        System.out.println("开越野车");
    }
}
