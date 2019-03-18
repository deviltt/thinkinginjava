package com.designpattern.abstractfactorypattern;

public class SportCar implements Cars {
    @Override
    public BenzCar createBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public BwmCar createBwmCar() {
        return new BwmSportCar();
    }
}
