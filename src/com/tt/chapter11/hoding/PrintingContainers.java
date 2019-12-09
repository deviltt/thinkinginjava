package com.tt.chapter11.hoding;

import java.util.*;

/**
 * fill方法被重载了，面向接口编程
 */
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
        System.out.println(fill(new ArrayList<>()));        //按照添加的顺序
        System.out.println(fill(new LinkedList<>()));       //按照添加的顺序

        System.out.println(fill(new HashSet<>()));          //不允许有重复值
        System.out.println(fill(new TreeSet<>()));          //按照字母的顺序排列后输出
        System.out.println(fill(new LinkedHashSet<>()));    //按照添加的顺序

        System.out.println(fill(new HashMap<>()));          //没有固定的顺序
        System.out.println(fill(new TreeMap<>()));          //按照字母的顺序排列后输出
        System.out.println(fill(new LinkedHashMap<>()));    //按照添加的顺序
    }
}
