package com.leetcode;

/**
 * 斐波那契数
 * 使用dp数组保存每一次计算的结果
 * 开辟了一个数组保存上次运行的结果
 */
public class solution509 {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}
