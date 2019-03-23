package com.designpattern.chapter3.beverage;

//装饰类
public class Pearl extends AbstractCondiment {
    private Beverage beverage;

    public Pearl(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDetail() {
        return beverage.getDetail() + ", pearl";
    }

    @Override
    public double price() {
        return beverage.price() + 2.5;
    }
}
