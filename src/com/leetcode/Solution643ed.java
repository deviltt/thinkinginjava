package com.leetcode;

/**
 * 滑动窗口问题：只需要计算一次k个元素的和，下一次滑动窗口时，只需要
 * 减去前一个值，加上后一个值
 */
public class Solution643ed {
    public double findMaxAverage(int[] nums, int k) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        //首先计算开头k个元素的和
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result = Math.max(result, sum);
        for (int i = 1; i <= nums.length - k; i++) {
            //每次只要减去前一个值，加上后一个值即可
            sum = sum - nums[i - 1] + nums[i + k - 1];
            result = Math.max(sum, result);
        }
        return (double) result / k;
    }
}
