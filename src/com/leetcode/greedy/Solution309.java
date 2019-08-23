package com.leetcode.greedy;

/**
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length == 0)
            return 0;
        int[] sell = new int[length];
        int[] buy = new int[length];
        sell[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < length; i++) {
            //卖出不持有
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            //买入持有
            if (i == 1) {
                buy[i] = Math.max(buy[i - 1], -prices[i]);
            } else {
                //持有股票的利润：1.本来就买入了；2.在两天之前卖出，然后在今天买入
                buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
            }
        }
        return sell[length - 1];
    }
}
