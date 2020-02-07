package com.leetcode.dp;

/**
 * 1314. 矩阵区域和
 * 暴力解法
 * 给你一个 m * n 的矩阵 mat 和一个整数 K ，请你返回一个矩阵 answer ，其中每个 answer[i][j] 是所有满足下述条件的元素 mat[r][c] 的和： 
 *
 * i - K <= r <= i + K, j - K <= c <= j + K 
 * (r, c) 在矩阵内。
 *
 * 输入：mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
 * 输出：[[12,21,16],[27,45,33],[24,39,28]]
 */
public class Solution1314 {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int height = mat.length;
        int width = mat[0].length;
        int[][] result = new int[height][width];
        int sum;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum = 0;
                for (int k = i - K; k <= i + K; k++) {
                    for (int l = j - K; l <= j + K; l++) {
                        if (k < 0 || k >= height || l < 0 || l >= width) {
                            sum += 0;
                        } else {
                            sum += mat[k][l];
                        }
                    }
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
