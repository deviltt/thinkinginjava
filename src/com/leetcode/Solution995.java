package com.leetcode;

public class Solution995 {
    public int minKBitFlips(int[] A, int K) {
        // flag为0表示当前位置需要翻转（这里的翻转指的是逻辑翻转）
        int flag = 0;
        int ans = 0;
        int length = A.length;

        for (int i = 0; i < length; i++) {
            // 查看上一次翻转的位置
            if (i >= K && A[i - K] > 1) {
                // 还原flag
                flag ^= 1;
                // 还原原来的数
                A[i - K] -= 2;
            }
            if (A[i] == flag) {
                if (i + K > length) {
                    return -1;
                }
                ++ans;
                flag ^= 1;
                A[i] += 2;
            }
        }
        return ans;
    }
}
