package com.designpattern.chapter3.beverage;

public class Test {
    public static void main(String[] args) {
        Beverage beverage=new MilkTea();
//        System.out.println("beverage: "+beverage.getDetail()+", price:"+beverage.price());
        //定了一杯奶茶，想要加红豆和珍珠
        beverage=new Mung(beverage);
        beverage=new Pearl(beverage);
        System.out.println("beverage:"+beverage.getDetail()+", price:"+beverage.price());
    }
}
