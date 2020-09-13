package com.leetcode;

/**
 * 79. 单词搜索（递归+回溯）
 */
public class Solution79 {
    private boolean[][] visited;
    private int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        char[] chars = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean flag=dfs(i, j, chars, 0, board);
                if (flag){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int i, int j, char[] chars, int count, char[][] board) {
        if (board[i][j] != chars[count]) {
            return false;
        } else if (count == chars.length - 1) {
            return true;
        }
        visited[i][j] = true;
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0];
            int newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]){
                    if (dfs(newi, newj, chars, count + 1, board)) {
                        result = true;
                        break;
                    }
                }
            }
        }
        if (!result){
            visited[i][j] = false;  //回溯
        }

        return result;
    }
}
