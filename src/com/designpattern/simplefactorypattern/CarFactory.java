package com.designpattern.simplefactorypattern;

public class CarFactory {
    //getCar();返回对应的车型
    public Car getCar(String car){
        switch (car){
            case "sportCar":
                return new SportCar();
            case "jeepCar":
                return new JeepCar();
            case "hatchbackCar":
                return new HatchbackCar();
        }
        return null;
    }
}
