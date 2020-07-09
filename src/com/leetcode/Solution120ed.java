package com.leetcode;

import java.util.List;

/**
 * O(n)的复杂度，n为triangle的size大小
 * 从底往上进行选择叠加
 */
public class Solution120ed {
    public int minimumTotal(List<List<Integer>> triangle) {
        //加1的原因，在第一次循环的时候要执行dp[j+1]，如果不加一会越界
        int[] dp = new int[triangle.size()+1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
