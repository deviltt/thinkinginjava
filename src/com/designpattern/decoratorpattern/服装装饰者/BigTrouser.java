package com.designpattern.decoratorpattern.服装装饰者;

public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("垮裤 ");
        super.show();
    }
}
