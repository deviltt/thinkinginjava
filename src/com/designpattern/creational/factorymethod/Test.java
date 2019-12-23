package com.designpattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        JavaVideoFactory javaVideoFactory=new JavaVideoFactory();
        javaVideoFactory.getVideo().play();
    }
}
