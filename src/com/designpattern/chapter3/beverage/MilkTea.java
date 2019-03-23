package com.designpattern.chapter3.beverage;

//被装饰对象
public class MilkTea extends Beverage {
    public MilkTea() {
        detail = "MilkTea";
    }

    @Override
    public double price() {
        return 10;
    }
}
