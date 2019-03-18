package com.designpattern.abstractfactorypattern;

public class BenzSportCar implements BenzCar {
    @Override
    public void drive() {
        System.out.println("奔驰越野车");
    }
}
