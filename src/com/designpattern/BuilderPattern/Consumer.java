package com.designpattern.BuilderPattern;

public class Consumer {
    public static void main(String[] args) {
        Builder a = new ConcreteBuilderB();
        Director director = new Director(a);
        Product product = director.create();
        System.out.println(product.getFood() + " " + product.getDrink());
    }
}
