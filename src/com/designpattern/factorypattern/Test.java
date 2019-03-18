package com.designpattern.factorypattern;

public class Test {
    public static void main(String[] args) {
        //我想开宝马车
        CarFactory carFactory = new BwmCarFactory();
        carFactory.getCar().createCar();
    }
}
