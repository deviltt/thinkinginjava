package com.designpattern.factorypattern;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
