package com.leetcodespecialtopic.dp;

public class Solution70 {
    public int climbStairs(int n) {
        return climb(0, n);
    }

    /**
     * i
     * n
     * @param i 表示当前阶数
     * @param n 表示目标阶数
     * @return
     */
    private int climb(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb(i + 1, n) + climb(i + 2, n);
    }
}
