package com.tt.chapter15.generics;

/**
 * 元祖的概念：将一组对象即多个对象打包存储于元祖内
 * @param <A>
 * @param <B>
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){
        first=a;
        second=b;
    }
    public String toString(){
        return "("+first+", "+second+")";
    }
}
