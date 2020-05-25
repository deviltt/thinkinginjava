package com.leetcode2;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, result = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            result = Math.max(result, prices[i] - min);
        }
        return 0;
    }
}
