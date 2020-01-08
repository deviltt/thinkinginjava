package com.designpattern.decoratorpattern.cake;

public class HamDecorator extends Decorator {
    private Cake cake;

    public HamDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String desc() {
        return cake.desc()+"/加火腿1.5元";
    }

    @Override
    public double cost() {
        return cake.cost() + 1.5;
    }
}
