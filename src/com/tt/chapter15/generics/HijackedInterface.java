package com.tt.chapter15.generics;

/**
 * 因为ComparablePet实现了Comparable接口，接口泛型参数是ComparablePet，
 * 因此其它任何实现了Comparable接口的类都不能用其他的泛型参数类型
 * 基类劫持了接口
 */
//class Cat extends ComparablePet implements Comparable<Cat>{
//    @Override
//    public int compareTo(Cat o) {
//        return 0;
//    }
//}

public class HijackedInterface {

}
