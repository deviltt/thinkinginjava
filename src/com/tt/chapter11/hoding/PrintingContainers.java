package com.tt.chapter11.hoding;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String, String> map){
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));          //不允许有重复值
        System.out.println(fill(new TreeSet<>()));          //按照字母的顺序排列后输出
        System.out.println(fill(new LinkedHashSet<>()));

        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));          //按照字母的顺序排列后输出
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
