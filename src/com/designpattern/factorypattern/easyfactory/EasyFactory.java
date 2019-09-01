package com.designpattern.factorypattern.easyfactory;

public class EasyFactory {
    public static Operation createOperation(String name) {
        Operation operation = null;
        switch (name) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }
        return operation;
    }
}
