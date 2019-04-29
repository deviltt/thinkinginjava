package com.leetcode;
/**
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        /**
         *min用来记录数组中的最小值，result用来记录股票买卖的最大值
         * 而股票买卖的最大值肯定是减去最小的值
         */
        int min = Integer.MAX_VALUE, result = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }
}
