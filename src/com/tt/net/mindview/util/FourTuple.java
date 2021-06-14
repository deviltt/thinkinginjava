package com.tt.net.mindview.util;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }

    public A getFirst(){
        return first;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ", " + fourth + ")";
    }

    public static void main(String[] args) {
        FourTuple<Integer, Integer, Integer, String> tuple=new FourTuple<>(1,2,3,"tt");
        System.out.println(tuple);
        System.out.println(tuple.getFirst());
    }
}
