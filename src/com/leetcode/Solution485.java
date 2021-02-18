package com.leetcode;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int result = 0;

        // 双指针滑动窗口
        while (right < nums.length) {
            if (nums[right] == 0) {
                result = Math.max(right - left, result);
                ++right;
                left = right;

            } else {
                ++right;
            }
        }
        return Math.max(right - left, result);
    }
}
