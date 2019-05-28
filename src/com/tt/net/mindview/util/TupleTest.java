package com.tt.net.mindview.util;

class Amphibian{}
class Vehicle{}

/**
 * 元祖的概念：将多个对象封装在一个对象中返回，调用时通过对象引用的方式调用
 */
public class TupleTest {

    private static TwoTuple<String, Integer> f(){
        return new TwoTuple<>("hi", 47);
    }

    private static TreeTuple<Amphibian, String, Integer> g(){
        return new TreeTuple<>(new Amphibian(), "hi", 47);
    }

    private static FourTuple<Vehicle, Amphibian, String, Integer> h(){
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    private static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple=f();
        System.out.println(twoTuple);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k().fifth);
    }
}
