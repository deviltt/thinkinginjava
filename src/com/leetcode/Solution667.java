package com.leetcode;

public class Solution667 {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];

        for (int i = 0; i < n - k - 1; i++) {
            result[i] = i + 1;
        }

        int j = 0;

        // 双指针法，奇数位置正序，偶数位置倒序
        int left = n - k;
        int right = n;
        for (int i = n - k - 1; i < n; i++) {
            if (j % 2 == 0) {
                result[i] = left;
                ++left;
            } else {
                result[i] = right;
                --right;
            }
            ++j;
        }
        return result;
    }
}
