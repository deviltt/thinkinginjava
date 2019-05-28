package com.tt.chapter15.generics;

public class GenericMethods {
    /**
     * 功能：打印泛型参数的类型
     * @param x 传入的参数
     * @param <T> 泛型
     */
    public <T> void f(T x){
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods=new GenericMethods();
        genericMethods.f(1.0);
        genericMethods.f(1);
        genericMethods.f(genericMethods);
    }
}
