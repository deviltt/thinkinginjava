package com.leetcode;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * 状态转移方程f(m,n)=f(m-1,n)+f(m,n-1)
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0||j==0)
                    dp[i][j]=1;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }
}
