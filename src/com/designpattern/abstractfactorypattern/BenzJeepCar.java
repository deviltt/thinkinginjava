package com.designpattern.abstractfactorypattern;

public class BenzJeepCar implements BenzCar {
    @Override
    public void drive() {
        System.out.println("奔驰吉普车");
    }
}
