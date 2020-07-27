package com.剑指offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 优化空间
 * dp[i] 表示 当前价格为price[i]时的最大利润
 * 状态转移方程：
 * dp[i] = max(dp[i-1], min(dp[0-i]))
 */
public class Offer63 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}
