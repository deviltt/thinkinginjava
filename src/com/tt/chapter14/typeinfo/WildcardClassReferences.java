package com.tt.chapter14.typeinfo;

public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;  //通配符
        intClass = double.class;
    }
}
