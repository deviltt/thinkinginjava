package com.tt.chapter11.hoding;

import java.util.*;

/**
 * 测试Arrays.asList();和Collections.addAll();方法
 * Arrays.asList();将一个数组转换为List对象
 */
public class AddingGroups {
    public static void main(String[] args) {
        //首先构建一个Collection对象，并对其进行初始化
        //Arrays.asList()接受一个数组或者逗号分隔的元素列表，转换成一个List对象
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};  //定义一个数组
        collection.addAll(Arrays.asList(moreInts)); //将一个数组转换为List对象
        //然后调用Collections.addAll()方法，接受一个Collection对象，然后用后面的参数填充这个Collection对象
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        //看似返回一个List，实际底层是一个数组，不可以调整数组的大小
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20); //底层表示的是数组，不能调整尺寸大小
        list.set(1, 99);
        //list.add(0, 100); 报错Exception in thread "main" java.lang.UnsupportedOperationException
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(((ArrayList<Integer>) collection).get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int[] temp = new int[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = i;
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(temp.toString());
    }
}
