package com.leetcode.greedy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 输入: [2,4,1], k = 2
 * 输出: 2
 * 解释: 在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * 思路：确定状态dp[i][k][0/1]表示第i天，已完成交易数为k，手里持有/不持有股票
 */
public class Solutuion188 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length==0)
            return 0;
        if (k>prices.length/2){
            int result= maxProfit(prices);
            return result;
        }
        int[][][] dp = new int[prices.length][k + 1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                if (i == 0) {
                    //第1天，手里不持有股票，不论已交易次数是多少，利润都是0
                    dp[i][j][0] = 0;
                    //第1天，手里持有股票，不论已交易次数是多少，利润都是-price[0]
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][k][0];
    }

    private int maxProfit(int[] prices) {
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
