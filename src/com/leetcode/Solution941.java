package com.leetcode;

/**
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * 输入：[2,1]
 * 输出：false
 * 输入：[3,5,5]
 * 输出：false
 */
public class Solution941 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3)
            return false;
        boolean up = false, down = false;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i] && !down) {
                up = true;
            } else if (A[i - 1] > A[i]) {
                down = true;
            } else {
                return false;
            }
        }
        return up && down;
    }
}
