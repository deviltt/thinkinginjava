package com.leetcodespecialtopic.binarysearch;

/**
 * 50. Pow(x, n)
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 *
 * 时间复杂度: O(log(N))
 */
public class Solution50ed {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return iteratorMyPow(x, n);
        } else {
            return iteratorMyPow(1 / x, n);
        }
    }

    private double iteratorMyPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = iteratorMyPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
