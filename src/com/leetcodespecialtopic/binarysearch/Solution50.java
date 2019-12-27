package com.leetcodespecialtopic.binarysearch;

/**
 * 50. Pow(x, n)
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 *
 * 时间复杂度: O(N)
 */
public class Solution50 {
    public double myPow(double x, int n) {
        int N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 0;
        for (int i = 0; i < N; i++) {
            result *= x;
        }
        Math.pow(x, n);
        return result;
    }
}
