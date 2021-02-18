package com.leetcode;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // 无法转换的情况
        if (r * c != nums.length * nums[0].length) {
            return nums;
        }
        int row = 0;
        int col = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                // 确定res数组的下标
                if (col == c) {
                    ++row;
                    col = 0;
                }
                res[row][col] = nums[i][j];
                ++col;
            }
        }
        return res;
    }
}
