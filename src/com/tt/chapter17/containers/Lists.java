package com.tt.chapter17.containers;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;    //新知识点

    public static void basicTest(List<String> a){
        a.add(1, "x");
        a.add("x");

    }
}
