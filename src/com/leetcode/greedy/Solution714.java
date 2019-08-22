package com.leetcode.greedy;

/**
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 * 你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * 返回获得利润的最大值。
 * 思路：最重要的是找到状态，dp[i][0]或者dp[i][1]，分别表示第i天持有股票或者不持有股票的最大利润
 * dp[i][0]=max(dp[i-1][0], dp[i-1][1]+price[i]-fee)
 * dp[i][1]=max(dp[i-1][1], dp[i-1][0]-price[i])
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        //因为第i天的结果是从第i-1天得来的，sell表示卖掉了不持有股票，hold表示买入持有股票
        int sell = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //不持有的最大利润：1.本来就不持有；2.本来持有，现在卖掉了
            sell = Math.max(sell, hold + prices[i] - fee);
            //持有股票的最大利润：1.本来就持有；2.本来不持有，现在买了(买入是不收手续费的)
            hold = Math.max(hold, sell - prices[i]);
        }
        return Math.max(sell, hold);
    }
}
