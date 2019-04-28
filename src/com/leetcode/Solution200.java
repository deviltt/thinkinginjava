package com.leetcode;

public class Solution200 {
    private int height, width, result;
    private boolean[][] visited;

    /**
     * @param grid
     * @return 岛屿的个数
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return result;
        //创建一个相同的二维数组用于记录数组中哪一个位置的数被访问过了
        height = grid.length;
        width = grid[0].length;
        visited = new boolean[height][width];
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //进行dfs的前提条件：当前遍历位置为1(岛屿),且当前位置没有被访问过
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j);
                    ++result;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int i, int j) {
        //遍历越界的情况
        if (i < 0 || i >= height || j < 0 || j >= width)
            return;
        //该岛屿被访问过，或者为水域
        if (grid[i][j] == '0' || visited[i][j])
            return;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
