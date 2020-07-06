package com.剑指offer;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * 划分边界
 */
public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, left = 0, x = 0;
        int[] result = new int[(right + 1) * (bottom + 1)];
        while (true) {
            for (int i = left; i <= right; i++) {
                result[x++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                result[x++] = matrix[i][right];
            }
            if (--right<left){
                break;
            }
            for (int i=right;i>=left;i--){
                result[x++]=matrix[bottom][i];
            }
            if (--bottom<top){
                break;
            }
            for (int i = bottom; i >=top ; i--) {
                result[x++]=matrix[i][left];
            }
            if (++left>right){
                break;
            }
        }
        return result;
    }
}
