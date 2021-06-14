package com.designpattern.visitor;

public class Steak extends Food {
    @Override
    public String name() {
        return "steak";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFood(this);
    }
}
