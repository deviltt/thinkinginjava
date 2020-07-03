package com.剑指offer;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * 快排思想
 */
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        return preDoQuickSort(arr, 0, arr.length - 1, k - 1);
    }

    private int[] preDoQuickSort(int[] arr, int l, int r, int k) {
        int j = quickSort(arr, l, r);   //j为拐点
        if (j == k) {
            return Arrays.copyOf(arr, k + 1);   //和substring一样，右开 [0, k+1)
        }
        return j < k ? preDoQuickSort(arr, j + 1, r, k) : preDoQuickSort(arr, l, j - 1, k); //递归执行子问题
    }

    private int quickSort(int[] arr, int l, int r) {
        int pivot = arr[l];
        while (l < r) {
            while (arr[r] >= pivot && l < r) {
                --r;
            }
            arr[l] = arr[r];
            while (arr[l] <= pivot && l < r) {
                ++l;
            }
            arr[r] = arr[l];
        }
        arr[l] = pivot;
        return l;
    }
}
