package com.leetcode.greedy;

/**
 * 123. 买卖股票的最佳时机 III
 * 思路：首先创建状态dp[n][k][0]表示第n天,至今交易次数为k，手里不持有股票
 * dp[n][k][1]表示第n天,至今交易次数为k，手里持有股票
 * 状态转移方程：dp[n][k][0]=max(dp[n-1][k][0], dp[n-1][k][1]+price[n])
 * dp[n][k][1]=max(dp[n-1][k][1], dp[n-1][k-1][0]-price[n])
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int max = 2;
        int[][][] dp = new int[prices.length][max + 1][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = max; j > 0; j--) {
                if (i == 0) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                //Math.max(本来就不持有，本来持有然后卖了
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                //Math.max(本来就持有，本来不持有(那至今为止交易次数为j-1次)然后买入
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][max][0];
    }
}
