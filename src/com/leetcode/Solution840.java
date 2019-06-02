package com.leetcode;

/**
 * 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
 * 给定一个由整数组成的 grid，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
 * 输入: [[4,3,8,4],
 * [9,5,1,9],
 * [2,7,6,2]]
 * 输出: 1
 * 解释:
 * 下面的子矩阵是一个 3 x 3 的幻方：
 * 438
 * 951
 * 276
 */
public class Solution840 {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length, col = grid[0].length, res = 0;
        if (row < 3 || col < 3)
            return res;
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                int a1 = grid[i - 1][j - 1], b1 = grid[i - 1][j], c1 = grid[i - 1][j + 1];
                int a2 = grid[i][j - 1], b2 = grid[i][j], c2 = grid[i][j + 1];
                int a3 = grid[i + 1][j - 1], b3 = grid[i + 1][j], c3 = grid[i + 1][j + 1];
                if (isMagic(a1, b1, c1, a2, b2, c2, a3, b3, c3)){
                    ++res;
                }
            }
        }
        return res;
    }

    private boolean isMagic(int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3) {
        //a1==b1只有一种情况成功即全是5的时候
        if(a1==b1)
            return false;
        else if (a1>9||b1>9||c1>9||a2>9||b2>9||c2>9||a3>9||b3>9||c3>9)
            return false;
        else
            return (a1 + b1 + c1 == 15) && (a2 + b2 + c2 == 15) && (a3 + b3 + c3 == 15) && (a1 + a2 + a3 == 15) && (b1 + b2 + b3 == 15) && (c1 + c2 + c3 == 15)
                    && (a1 + b2 + c3 == 15) && (c1 + b2 + a3 == 15);
    }
}
