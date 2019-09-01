package com.designpattern.factorypattern.easyfactory;

public class Div implements Operation {
    @Override
    public double getResult(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("111");
        }
        return num1 / num2;
    }
}
