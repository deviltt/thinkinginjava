package com.剑指offer;

public class Offer4 {
    /**
     * @param flag true表示行搜索，false表示列搜索
     * @return
     */
    private boolean binarySearch(int[][] matrix, int start, boolean flag, int target) {
        int left = start;
        int right = flag ? matrix[0].length - 1 : matrix.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (flag) {
                if (matrix[start][mid] < target) {
                    left = mid + 1;
                } else if (matrix[start][mid] > target) {
                    right = mid - 1;
                } else {
                    return true;
                }
            } else {
                if (matrix[mid][start] < target) {
                    left = mid + 1;
                } else if (matrix[mid][start] > target) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        //以对角线作为起始搜索路径，然后分别搜索行和列
        //不是n * n 的阶形矩阵，因此取最小值遍历
        int num = Math.min(matrix.length, matrix[0].length);
        boolean rowSearch, colSearch;
        for (int i = 0; i < num; i++) {
            rowSearch = binarySearch(matrix, i, true, target);
            colSearch = binarySearch(matrix, i, false, target);
            if (rowSearch || colSearch) {
                return true;
            }
        }
        return false;
    }
}
