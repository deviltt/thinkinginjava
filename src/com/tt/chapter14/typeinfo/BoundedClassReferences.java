package com.tt.chapter14.typeinfo;

public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;bounded = Integer.class;
    }

}
