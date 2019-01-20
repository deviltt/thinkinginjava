package com.tt.chapter11.hoding;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple apple : apples
             ) {
            System.out.println(apple.id());
        }
    }
}
