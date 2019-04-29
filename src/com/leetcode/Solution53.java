package com.leetcode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 思路：确定状态转移方程:
 * f(n)=max(nums(n), nums(n)+f(n-1))
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, temp = 0;
        for (int a : nums) {
            temp = Math.max(a, a + temp);
            result = Math.max(result, temp);
        }
        return result;
    }
}
