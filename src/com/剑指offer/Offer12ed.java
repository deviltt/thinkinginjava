package com.剑指offer;

/**
 *  剑指 Offer 12. 矩阵中的路径
 */
public class Offer12ed {
    public boolean exist(char[][] board, String word) {
        char[] wordArr = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, wordArr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param board   代表矩阵
     * @param wordArr 目标字符数组
     * @param i       从矩阵中的哪一位开始(行)
     * @param j       从矩阵中的哪一位开始(列)
     * @param index   第几个字符
     * @return
     */
    private boolean dfs(char[][] board, char[] wordArr, int i, int j, int index) {
        //如果是最后一位字符，则不需要继续往下遍历了，其它情况只需要考虑是否越界
        if (i < 0 || i >= board.length || j >= board[0].length || j < 0 || board[i][j] != wordArr[index]) {
            return false;
        }
        if (index == wordArr.length - 1) {
            return true;
        }

        char temp = board[i][j];    //保留原来的字符，返回失败的话还能保持原来的值
        board[i][j] = '/';

        boolean res = dfs(board, wordArr, i + 1, j, index + 1) || dfs(board, wordArr, i - 1, j, index + 1)
                || dfs(board, wordArr, i, j + 1, index + 1) || dfs(board, wordArr, i, j - 1, index + 1);

        board[i][j] = temp;
        return res;
    }
}
