package com.leetcode;

import sun.applet.Main;

public class Solution1004 {
    public int longestOnes(int[] A, int K) {
        int rSum = 0;
        int lSum = 0;
        int left = 0;
        int result = 0;
        int n = A.length;

        for (int right = 0; right < n; right++) {
            rSum += 1 - A[right];
            while (lSum < rSum - K) {
                lSum += 1 - A[left];
                ++left;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
