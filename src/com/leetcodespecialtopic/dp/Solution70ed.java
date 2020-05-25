package com.leetcodespecialtopic.dp;

/**
 * 方程 f(i)=f(i-1)+f(i-2)
 */
public class Solution70ed {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
