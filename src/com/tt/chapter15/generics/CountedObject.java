package com.tt.chapter15.generics;

public class CountedObject {
    private static long counter = 0;  //静态变量，类共享，即所有对象共享这个变量
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
}
