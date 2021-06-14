package com.leetcode;

public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        int col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            sum += col - tool(grid[i], 0, grid[i].length - 1);
        }
        return sum;
    }


    /**
     * 找到正负数的分界线，负数右边的全是负数
     * 递减，找到第一个小于0的数
     *
     * @return
     */
    private int tool(int[] arr, int l, int r) {
        while (l != r) {
            int mid = (r - l) / 2 + l;
            if (arr[mid] >= 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return arr[r] >= 0 ? arr.length : r;
    }
}
