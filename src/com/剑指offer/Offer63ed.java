package com.剑指offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 传统的方式，不优化空间
 */
public class Offer63ed {
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int length = prices.length;
        int[] dp = new int[length]; //创建与原数组一样大小的数组，用来保存当前的状态
        int minPrice = prices[0];   //初始化当前最小值就是prices[0]
        for (int i = 1; i < length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            dp[i] = Math.max(dp[i-1], prices[i] - minPrice);
        }
        return dp[length - 1];
    }
}
