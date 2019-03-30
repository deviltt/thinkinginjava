package com.swordoffer;

/**
 * 查看数组中是否有重复值
 * [2,3,1,0,2,5,3]
 * [1,3,2,0,2,5,3]
 * [3,1,2,0,2,5,3]
 * [0,1,2,3,2,5,3]
 * 另外还可以用hashMap的方法
 */
public class Solution3 {
    public boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //当索引的值与当前索引对应的元素值不相同时
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    return true;
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return false;
    }
}
