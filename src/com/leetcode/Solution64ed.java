package com.leetcode;

/**
 * 求解最短路径和
 * 使用dp[i][j] 表示从i~j的路径最小权值和
 */
public class Solution64ed {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j != grid[0].length - 1)    //最下面一行(除了右下角)
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                else if (j == grid[0].length - 1 && i != grid.length - 1)   //最右边一列(除了右下角)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                else if (i != grid.length - 1 && j != grid[0].length - 1)   //中间
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                else    //右下角元素
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }
}
