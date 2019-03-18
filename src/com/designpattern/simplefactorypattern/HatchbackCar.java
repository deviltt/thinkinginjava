package com.designpattern.simplefactorypattern;

public class HatchbackCar implements Car {
    @Override
    public void getCar() {
        System.out.println("开两厢车");
    }
}
