package com.designpattern.visitor;

public interface IVisitor {
    void chooseFood(Lobster lobster);
    void chooseFood(Watermelon watermelon);
    void chooseFood(Steak steak);
    void chooseFood(Banana banana);
}
