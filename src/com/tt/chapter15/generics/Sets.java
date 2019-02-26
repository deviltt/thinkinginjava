package com.tt.chapter15.generics;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    //将两个集合合并起来
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    //取两个集合的交集
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    //superset集合中移除subset包含的部分
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    //返回两个集合交集之外的部分
    public static <T> Set<T> complement(Set<T> a, Set<T> b){
        return difference(union(a, b), intersection(a, b));
    }
}
