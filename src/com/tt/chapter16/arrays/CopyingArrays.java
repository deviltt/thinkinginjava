package com.tt.chapter16.arrays;

import java.util.Arrays;

/**
 * System.arraycopy(src, srcPos, dest, destPos, length)
 * 从src的srcPos开始，从dest的destPos开始，复制length长度到dest数组中
 * Arrays.toString(arr); 用来打印数组
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println("k = " + Arrays.toString(k));
        Arrays.fill(k, 103);
        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println("i = " + Arrays.toString(i));
        //对象类型
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(10));
        Arrays.fill(v, new Integer(5));
        System.out.println("u = " + Arrays.toString(u));
        System.out.println("v = " + Arrays.toString(v));
        System.arraycopy(v, 0, u, u.length / 2, v.length);
        System.out.println("u = " + Arrays.toString(u));
    }
}
