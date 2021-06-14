package com.designpattern.visitor;

public class Lobster extends Food {
    @Override
    public String name() {
        return "lobster";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFood(this);
    }
}
