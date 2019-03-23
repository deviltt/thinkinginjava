package com.designpattern.chapter3.beverage;

//装饰类
public class Mung extends AbstractCondiment {
    private Beverage beverage;

    public Mung(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDetail(){
        return beverage.getDetail()+", Mung";
    }

    @Override
    public double price() {
        return beverage.price() + 1.5;
    }
}
