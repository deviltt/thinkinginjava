package com.tt.chapter13;

import com.tt.chapter15.generics.coffee.Coffee;
import com.tt.chapter15.generics.coffee.CoffeeGenerator;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees=new ArrayList<>();
        for (Coffee coffee:new CoffeeGenerator(10))
            coffees.add(coffee);
        System.out.println(coffees);
    }
}
