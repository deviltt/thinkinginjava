package com.剑指offer;

/**
 * 面试题14- I. 剪绳子
 * 动态规划的核心是记录之前的计算结果，下次直接使用
 */
public class Offer14_1 {
    public int integerBreak(int n) {
        //dp[i]表示保存整数i拆分成至少两个正整数之和的最大成绩
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                /**
                 * 分三种情况，取其中的一个最大值
                 * dp[i]表示维持原状
                 * j * (i-j) 表示在位置j处剪一刀，右边也不剪了
                 * j * dp[i-j] 表示在位置j处剪一刀，右边继续剪
                 *
                 * 为什么没有 dp[j] * dp[i-j] 表示 在位置j处剪一刀，然后左右继续剪
                 * 其实是已经重复计算了，假设i=10
                 * 当j = 4的时候，如果左右都剪 dp[4] * dp[6]
                 * 当在dp[4]的位置1处剪一刀
                 * 实际上就相当于 1 * dp[9] 中的某一种情况
                 * 因此不需要再额外的考虑 dp[i] * dp[j]
                 */
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
