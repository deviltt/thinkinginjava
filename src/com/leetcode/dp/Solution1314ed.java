package com.leetcode.dp;

/**
 * 二维前缀和的思想
 */
public class Solution1314ed {
    private int[][] dp;

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int rows = mat.length;
        int cols = mat[0].length;
        dp = new int[rows + 1][cols + 1];

        //初始化二维前缀和数组
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i + 1][j + 1] = dp[i][j + 1] + dp[i + 1][j] - dp[i][j] + mat[i][j];
            }
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //确定边界
                int row1 = Math.max(0, i - K);
                int col1 = Math.max(0, j - K);
                int row2 = Math.min(rows - 1, i + K);
                int col2 = Math.min(cols - 1, j + K);
                result[i][j] = sumRegion(row1, col1, row2, col2);
            }
        }
        return result;
    }

    /**
     * 使用初始化的二维前缀和数组求任意一个子矩阵的元素和
     * @param row1
     * @param col1
     * @param row2
     * @param col2
     * @return
     */
    private int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row2 + 1][col1] - dp[row1][col2 + 1] + dp[row1][col1];
    }
}
