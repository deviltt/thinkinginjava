package com.designpattern.factorypattern.easyfactory;

public class Sub implements Operation {
    @Override
    public double getResult(double num1, double num2) {
        return num1 - num2;
    }
}
