package com.designpattern.factorypattern;

public class BenzCar implements Car {
    @Override
    public void createCar() {
        System.out.println("开奔驰车");
    }
}
