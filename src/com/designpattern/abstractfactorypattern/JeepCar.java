package com.designpattern.abstractfactorypattern;

public class JeepCar implements Cars {
    @Override
    public BenzCar createBenzCar() {
        return new BenzJeepCar();
    }

    @Override
    public BwmCar createBwmCar() {
        return new BwmJeepCar();
    }
}
