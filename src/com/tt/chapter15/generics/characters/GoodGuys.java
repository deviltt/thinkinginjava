package com.tt.chapter15.generics.characters;

public class GoodGuys extends Guys{
    private static int count;
    private final int id = count++;

    @Override
    public String toString() {
        return "GoodGuy: " + getClass().getSimpleName() + " " + id;
    }
}
