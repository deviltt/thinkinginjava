package com.剑指offer;

public class Offer12 {
    private boolean[][] marked; //用来标记哪个已经访问过了
    private String word;
    //定义上下左右四个方向:左，右，上，下
    private int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        this.marked = new boolean[board.length][board[0].length];
        this.word = word;
        this.board = board;
        //从起点0开始回溯遍历
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param row   行
     * @param col   列
     * @param index 遍历到了目标字符串word第几个字符
     * @return
     */
    private boolean dfs(int row, int col, int index) {
        //如果到了最后一个字符，那么就不用递归了
        if (index == word.length() - 1) {
            return word.charAt(index) == board[row][col];
        }

        if (board[row][col] == word.charAt(index)) {
            marked[row][col] = true;
            for (int i = 0; i < 4; i++) {
                int newRow = row + direction[i][0];
                int newCol = col + direction[i][1];
                //没有标记过，并且没有越界错误
                if (dealOutOfBound(newRow, newCol) && !marked[newRow][newCol]) {
                    if (dfs(newRow, newCol, index + 1)) {
                        return true;
                    }
                }
            }
            //如果这个数的下一个所有方向都不符合要求，那么这个数对应的mark标记还要回退回来
            marked[row][col] = false;
        }
        //不相等就直接返回了
        return false;
    }

    private boolean dealOutOfBound(int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
}
