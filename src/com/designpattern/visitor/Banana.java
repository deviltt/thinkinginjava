package com.designpattern.visitor;

public class Banana extends Food {
    @Override
    public String name() {
        return "banana";
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.chooseFood(this);
    }
}
