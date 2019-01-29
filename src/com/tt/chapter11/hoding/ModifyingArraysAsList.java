package com.tt.chapter11.hoding;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //使用ArrayList对其进行了包装，因此是对引用进行操作
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        System.out.println("Before shuffling: " + integerList);
        Collections.shuffle(integerList, random);
        System.out.println("After shuffling: " + integerList);
        System.out.println("array: " + Arrays.toString(integers));

        //直接使用Arrays.asList();会对原始数组元素的物理结构产生变化
        List<Integer> integers1 = Arrays.asList(integers);
        System.out.println("Before shuffling: " + integers1);
        Collections.shuffle(integers1, random);
        System.out.println("After shuffling: " + integers1);
        System.out.println("array: " + Arrays.toString(integers));
    }
}
