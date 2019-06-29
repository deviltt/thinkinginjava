package com.leetcode;

/**
 * 给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。
 * 下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。
 * 在下一行选择的元素和当前行所选元素最多相隔一列
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：12
 * 解释：
 * 可能的下降路径有：
 * [1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
 * [2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
 * [3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
 * 和最小的下降路径是 [1,4,7]，所以答案是 12。
 */
public class Solution931 {
    public int minFallingPathSum(int[][] A) {
        int min;
        //利用原数组
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                min = A[i - 1][j];
                if (j - 1 >= 0)
                    min = Math.min(min, A[i - 1][j - 1]);
                if (j + 1 < A[0].length)
                    min = Math.min(min, A[i - 1][j + 1]);
                A[i][j]=min+A[i][j];
            }
        }
        min=Integer.MAX_VALUE;
        for (int i = 0; i < A[A.length - 1].length; i++) {
            min=Math.min(min,A[A.length-1][i]);
        }
        return min;
    }
}
