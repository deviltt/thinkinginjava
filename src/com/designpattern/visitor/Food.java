package com.designpattern.visitor;

public abstract class Food {
    public abstract String name();

    public abstract void accept(IVisitor iVisitor);
}
