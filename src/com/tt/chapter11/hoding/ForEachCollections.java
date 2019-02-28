package com.tt.chapter11.hoding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 证明所有的Collection对象都可以直接用于foreach循环
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        Collections.addAll(collection, "i love you".split(" "));
        for (String s : collection){
            System.out.print(s + " ");
        }
    }
}
