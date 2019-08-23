package com.leetcode.greedy;

/**
 * 对其进行降维处理
 */
public class Solution188ed {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0)
            return 0;
        if (k > prices.length / 2) {
            return maxProfit(prices);
        }
        int[] buy = new int[k + 1];     //买入持有的利润，第k次交易
        int[] sell = new int[k + 1];    //卖出不持有的利润，第k次交易
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                if (i == 0) {
                    buy[j] = -prices[i];
                    sell[j] = 0;
                    continue;
                }
                buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }
        return sell[k];
    }

    /**
     * 如果规定交易次数大于一半，那就类似于不规定交易次数
     *
     * @param prices
     * @return
     */
    private int maxProfit(int[] prices) {
        int buy = -prices[0], sell = 0;     //买入持有的利润，卖出不持有的利润
        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i]);
        }
        return sell;
    }
}
