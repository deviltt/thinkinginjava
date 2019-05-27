package com.tt.net.mindview.util;

public class TreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public TreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
