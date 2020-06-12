package com.剑指offer;

public class Offer13 {
    private boolean[][] marked;
    private int[][] direction;
    private int count;
    private int rows;
    private int cols;

    public int movingCount(int m, int n, int k) {
        this.marked = new boolean[m][n];
        this.direction = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        this.count = 0;
        this.rows = m;
        this.cols = n;

        dfs(0, 0, k);
        return count;
    }

    private void dfs(int m, int n, int k) {
        if (m == rows - 1 && n == cols - 1) {
            if (sum(m) + sum(n) <= k) {
                marked[m][n] = true;
                ++count;
                return;
            }
        }
        if (sum(m) + sum(n) <= k) {
            ++count;
            marked[m][n] = true;
            for (int i = 0; i < 4; i++) {
                int newRow = m + direction[i][0];
                int newCol = n + direction[i][1];
                if (isNotOutOfBound(newRow, newCol) && !marked[newRow][newCol]) {
                    dfs(newRow, newCol, k);
                }
            }
        }
        marked[m][n] = true;
    }

    private boolean isNotOutOfBound(int m, int n) {
        return m >= 0 && m < rows && n >= 0 && n < cols;
    }

    private int sum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
