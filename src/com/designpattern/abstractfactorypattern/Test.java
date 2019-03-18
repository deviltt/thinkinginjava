package com.designpattern.abstractfactorypattern;

public class Test {
    public static void main(String[] args) {
        //需要哪种类型的车
        Cars cars=new SportCar();
        //需要哪个牌子的车
        cars.createBenzCar().drive();
    }
}
