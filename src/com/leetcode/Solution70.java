package com.leetcode;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 状态转移方程dp[i]=dp[i-1]+dp[i-2]
 */
public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
        //也可以不用保存之前的结果
        int a = 1, b = 2, t = 0;
        for (int i = 3; i <= n; i++) {
            t = a + b;
            a = b;
            b = t;
        }
        return t;
    }
}
