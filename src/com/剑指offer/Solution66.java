package com.剑指offer;

/**
 * 剑指 Offer 66. 构建乘积数组
 */
public class Solution66 {
    public int[] constructArr(int[] a) {
        //用一个数组保存乘积结果
        int length = a.length;
        int[] temp = new int[length];
        temp[0] = 1;
        int count = 1;  //记录从右往左累乘的积

        for (int i = 1; i < length; i++) {
            temp[i] = temp[i - 1] * a[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            count *= a[i + 1];
            temp[i] *= count;
        }
        return temp;
    }
}
