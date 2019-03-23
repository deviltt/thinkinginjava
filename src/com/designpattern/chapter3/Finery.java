package com.designpattern.chapter3;

public abstract class Finery extends Person {
    private Person person;

    //对谁进行装饰
    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null)
            person.show();
    }
}
