package com.designpattern.chapter3;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("tt");
        TShirts tShirts=new TShirts();
        BigTrouser bigTrouser=new BigTrouser();
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
