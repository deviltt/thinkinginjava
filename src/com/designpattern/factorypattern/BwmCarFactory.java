package com.designpattern.factorypattern;

public class BwmCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BwmCar();
    }
}
