package com.leetcode.greedy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * <p>
 * 在某一天，一共有两个状态，1.手里持有股票；2.手里不持有股票
 * 思路：设dp[i][0]表示第i天不持有股票的最大利润，dp[i][1]表示第i天手里持有股票的最大利润
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;   //第1天手里不持有股票
        dp[0][1] = -prices[0];  //第1天手里持有股票
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);    //第i天手里不持有股票
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);    //第i天手里持有股票
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }
}
