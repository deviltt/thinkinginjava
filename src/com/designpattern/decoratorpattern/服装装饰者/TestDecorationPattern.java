package com.designpattern.decoratorpattern.服装装饰者;

public class TestDecorationPattern {
    public static void main(String[] args) {
        Person person = new Person("小明");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);
        tShirts.show();
    }
}
