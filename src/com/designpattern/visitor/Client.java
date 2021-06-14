package com.designpattern.visitor;

public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        IVisitor Aurora = new Aurora();
//        IVisitor Kevin = new Kevin();
        restaurant.welcome(Aurora);
//        restaurant.welcome(Kevin);
    }
}
