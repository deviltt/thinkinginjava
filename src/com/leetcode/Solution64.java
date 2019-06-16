package com.leetcode;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 示例:
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        return calculate(grid, 0, 0);
    }

    private int calculate(int[][] grid, int m, int n) {
        if (m == grid.length || n == grid[0].length)
            return Integer.MAX_VALUE;
        if (m == grid.length - 1 && n == grid[0].length - 1)
            return grid[m][n];
        return grid[m][n] + Math.min(calculate(grid, m + 1, n), calculate(grid, m, n + 1));
    }
}
