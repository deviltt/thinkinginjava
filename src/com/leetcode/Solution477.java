package com.leetcode;

public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int sum = 0, n = nums.length;
        for (int i = 0; i < 29; i++) {
            // 统计一共有多少个1
            int oneNums = 0;
            for (int j = 0; j < nums.length; j++) {
                oneNums += nums[j] >> i & 1;
            }
            sum += oneNums * (n - oneNums);
        }
        return sum;
    }
}
