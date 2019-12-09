package com.designpattern.decoratorpattern.服装装饰者;

public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤 ");
        super.show();
    }
}
