package com.designpattern.decoratorpattern.cake;

public class EggDecorator extends Decorator {
    private Cake cake;

    public EggDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String desc() {
        return cake.desc()+"/加鸡蛋1.5元";
    }

    @Override
    public double cost() {
        return cake.cost() + 1.5;
    }
}
