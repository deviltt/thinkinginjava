package com.剑指offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * BFS
 */
public class Offer13ed {
    public int movingCount(int m, int n, int k) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] direction = new int[][]{{1, 0}, {0, 1}};
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int i = temp[0];
            int j = temp[1];
            int sum = sum(i) + sum(j);
            if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || sum > k) {
                continue;
            }
            visited[i][j] = true;
            ++count;
            queue.add(new int[]{i + direction[0][0], j + direction[0][1]});
            queue.add(new int[]{i + direction[1][0], j + direction[1][1]});
        }
        return count;
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
