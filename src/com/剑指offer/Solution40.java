package com.剑指offer;

import java.util.Arrays;

/**
 * 取前k个小的数
 */
public class Solution40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }
}
