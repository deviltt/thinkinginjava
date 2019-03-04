package com.tt.chapter15.generics;

class Manipulator<T extends HasF>{
    private T obj;
    public Manipulator(T x){
        obj = x;
    }
    public void manipulate(){
        obj.f();
    }
}

public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hasF);
        manipulator.manipulate();
    }
}
