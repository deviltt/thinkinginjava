package com.tt.chapter15.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fruits=new ArrayList<Apple>();
//        fruits.add(new Apple());
//        fruits.add(new Orange());
    }
}
