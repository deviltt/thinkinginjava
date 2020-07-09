package com.preparing;


public class Solution37 {
    public static void main(String[] args) {
        char arr[][]={
                {'7', '2' ,'6', '9' ,'.','4','.','5','1'},
                {'.','8','.','6','.','7','4','3','2'},
                {'3','4','1','.','8','5','.','.','9'},
                {'.','5','2','4','6','8','.','.','7'},
                {'.','3','7','.','.','.','6','8','.'},
                {'.','9','.','.','.','3','.','1','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','2','1','5','.','.'},
                {'8','.','.','3','.','.','.','.','.',},
        };
        solveSudoku(arr);
    }

    public static void solveSudoku(char[][] board) {
        //1. 先初始化计数数组，计数数组就是记录 行 列 宫 哪些地方已经被填过了
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][][] boxUsed = new boolean[3][3][10]; //[3][3]表示9个宫

        //初始化校验数组
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int num = board[row][col] - '0';        //
                if (1<=num&& num<=9) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row / 3][col / 3][num] = true;
                }
            }
        }

        recusiveSolveSudoku(board, rowUsed, colUsed, boxUsed, 0, 0);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if (j == 8) {
                    System.out.println();
                }
            }
        }
    }

    private static boolean recusiveSolveSudoku(char[][] board, boolean[][] rowUsed, boolean[][] colUsed, boolean[][][] boxUsed, int row, int col) {
        //边界情况以及终止情况
        if(col == board[0].length){
            col = 0;
            row++;
            if(row == board.length){
                return true;
            }
        }
        // 是空则尝试填充, 否则跳过继续尝试填充下一个位置
        if(board[row][col] == '.') {
            //遍历一到九
            for (int num = 1; num <=9 ; num++) {
                //看能否用
                boolean canUsed = !(rowUsed[row][num] || colUsed[col][num] || boxUsed[row/3][col/3][num]);

                if (canUsed) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row / 3][col / 3][num] = true;

                    board[row][col] = (char) ('0' + num);   //

                    if (recusiveSolveSudoku(board, rowUsed, colUsed, boxUsed, row, col + 1)) {
                        return true;
                    }
                    board[row][col] = '.';
                    rowUsed[row][num] = false;
                    colUsed[col][num] = false;
                    boxUsed[row / 3][col / 3][num] = false;
                }
            }
        } else {
            return recusiveSolveSudoku(board, rowUsed, colUsed, boxUsed, row, col + 1);
        }
        //遍历一到九跳出，如果不能用直接返回false
        return false;
    }
}

