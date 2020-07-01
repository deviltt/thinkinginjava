package com.剑指offer;

/**
 * 动态规划
 * dp[i] 表示以 nums[i] 结尾的最大值
 * dp[i] = max(dp[i-1]+nums[i], nums[i])
 */
public class Offer42 {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int[] dp = new int[nums.length ];
        dp[0] = nums[0];
        res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res=Math.max(res, dp[i]);
        }
        return res;
    }
}
