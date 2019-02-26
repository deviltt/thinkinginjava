package com.tt.chapter15.generics.characters;

public class BadGuys extends Guys {
    private static int count;
    private final int id = count++; //每创建一个对象id值都会加一

    @Override
    public String toString() {
        return "BadGuy: " + getClass().getSimpleName() + " " + id;
    }
}
