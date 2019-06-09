package com.leetcode.dp;

/**
 * dp[i][j]表示从i到j能获得的最大差值
 * 最终的结果肯定是判定(0~piles.length-1)这个区间内的最大差值是否大于0
 * 当计算i~j区间的最大差值时，计算方法如下：
 * 取piles[i]-dp[i+1][j]和piles[j]-dp[i][j-1]两者的较大值
 */
public class Solution877 {
    public boolean stoneGame(int[] piles) {
        int length = piles.length;
        int[][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = piles[i];
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                dp[j][j + i] = Math.max(piles[j] - dp[j + 1][j + i], piles[j + i] - dp[j][j + i - 1]);
            }
        }
        return dp[0][length - 1] > 0;
    }
}
