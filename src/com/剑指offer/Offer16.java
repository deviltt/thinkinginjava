package com.剑指offer;

/**
 * 剑指 Offer 16. 数值的整数次方
 * 迭代法
 */
public class Offer16 {
    public double myPow(double x, int n) {
        return n >= 0 ? dfs(x, n) : 1 / dfs(x, n);
    }

    private double dfs(double x, int n) {
        //终止条件，当 n=0 的时候，返回1
        if (n == 0) {
            return 1.0;
        }

        double y = dfs(x, n / 2);   //先计算保留y的结果，然后直接使用，不然要计算两次

        return n % 2 == 0 ? y * y : x * y * y;
    }
}
