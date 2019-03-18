package com.designpattern.simplefactorypattern;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("sportCar");
        car.getCar();
    }
}
