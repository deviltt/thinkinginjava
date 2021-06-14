package com.designpattern.visitor;

public class Watermelon extends Food {
    @Override
    public String name() {
        return "watermelon";
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.chooseFood(this);
    }
}
