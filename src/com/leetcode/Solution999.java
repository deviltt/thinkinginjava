package com.leetcode;

/**
 *  首先确定并记录R的位置，在分别从四个方向遍历二维数组
 *  满足条件后改变count的值并跳出循环
 */
public class Solution999 {
    public int numRookCaptures(char[][] board) {
        //Rx表示车的起始X位置，Ry表示车的起始Y位置
        int Rx = 0, Ry = 0, count = 0;
        //遍历二维数组寻找车的位置
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    Rx = i;
                    Ry = j;
                }
            }
        }
        //扫描右边
        for (int i = Ry + 1; i < board[0].length; i++) {
            if (board[Rx][i] == 'p') {
                ++count;
                break;
            } else if (board[Rx][i] == 'B')
                break;
        }
        //扫描下边
        for (int i = Rx + 1; i < board.length; i++) {
            if (board[i][Ry] == 'p') {
                ++count;
                break;
            } else if (board[i][Ry] == 'B')
                break;
        }
        //扫描左边
        for (int i = Ry - 1; i >= 0; i--) {
            if (board[Rx][i] == 'p') {
                ++count;
                break;
            } else if (board[Rx][i] == 'B')
                break;
        }
        //扫描上边
        for (int i = Rx - 1; i >= 0; i--) {
            if (board[i][Ry] == 'p') {
                ++count;
                break;
            } else if (board[i][Ry] == 'B')
                break;
        }
        return count;
    }
}
