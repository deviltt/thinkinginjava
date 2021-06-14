package com.tt.chapter15.generics;

class Automobile {

}

/**
 * Holder1 这个类只能持有 AutoMobile 这一个类型
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}
