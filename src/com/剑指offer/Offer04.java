package com.剑指offer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * 从右上角开始而不从左上角开始的原因：
 * 左上角开始如果当前值比右值或者下值都大
 * 不知道应该往右走还是往下走，需要回溯
 * 而从右上角开始，如果当前值比target小，那么一定是往下走
 * 如果当前值比target大，那么一定是往左走
 */
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] < target) {
                ++row;
            } else {
                --column;
            }
        }
        return false;
    }
}
