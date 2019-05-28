package com.tt.chapter15.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> list = new ArrayList<>();
        for (T t : args) {
            list.add(t);
        }
//        Collections.addAll(list, args);
        return list;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMN".split(""));
        System.out.println(ls);
        ls = makeList(new String[]{"1", "2", "3"});
        System.out.println(ls);
    }
}
