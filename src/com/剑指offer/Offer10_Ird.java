package com.剑指offer;

/**
 * 剑指 Offer 10- I. 斐波那契数列递归运算的优化
 * 动态规划
 * dp[i]表示当n=i的时候当前斐波那契数
 */
public class Offer10_Ird {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            int temp=fib[i-1]+fib[i-2];
            fib[i] = temp%1000000007;
        }
        return fib[n];
    }
}
