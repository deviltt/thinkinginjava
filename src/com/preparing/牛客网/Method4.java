package com.preparing.牛客网;

import java.util.*;

public class Method4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        while (scanner.hasNext()) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.valueOf(scanner.next());
                }
            }

            shudu(arr);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }


    }

    private static void shudu(int[][] arr) {
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][][] boxUsed = new boolean[3][3][10];

        //初始化
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                if (temp != 0) {
                    rowUsed[i][temp] = true;
                    colUsed[j][temp] = true;
                    boxUsed[i / 3][j / 3][temp] = true;
                }
            }
        }
        transShudu(arr, rowUsed, colUsed, boxUsed, 0, 0);
    }

    private static boolean transShudu(int[][] arr, boolean[][] rowUsed, boolean[][] colUsed, boolean[][][] boxUsed, int row, int col) {
        //边界条件
        if (col == arr[0].length) {
            col = 0;
            ++row;
            if (row == arr.length) {
                return true;
            }
        }

        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                boolean canUse = !(rowUsed[row][i] || colUsed[col][i] || boxUsed[row / 3][col / 3][i]);
                if (canUse) {
                    rowUsed[row][i] = true;
                    colUsed[col][i] = true;
                    boxUsed[row / 3][col / 3][i] = true;
                    arr[row][col] = i;
                    if (transShudu(arr, rowUsed, colUsed, boxUsed, row, col + 1)) {
                        return true;
                    }
                    arr[row][col] = 0;
                    rowUsed[row][i] = false;
                    colUsed[col][i] = false;
                    boxUsed[row / 3][col / 3][i] = false;
                }
            }
        } else {
            return transShudu(arr, rowUsed, colUsed, boxUsed, row, col + 1);
        }
        return false;
    }
}