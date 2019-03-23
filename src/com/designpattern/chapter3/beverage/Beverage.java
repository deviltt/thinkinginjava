package com.designpattern.chapter3.beverage;

//抽象奶茶类
public abstract class Beverage {
    String detail = "Unknown beverage";

    public String getDetail() {
        return detail;
    }

    public abstract double price();
}
