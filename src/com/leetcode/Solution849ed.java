package com.leetcode;

/**
 * 这题的关键就是要考虑开始为0和结束为0这两种情况
 */
public class Solution849ed {
    public int maxDistToClosest(int[] seats) {
        int i = 0;
        while (seats[i] == 0)
            i++;
        int max = i;
        int start = i++;
        while (i < seats.length) {
            if (seats[i] == 1) {
                max = Math.max(max, (i - start) / 2);
                start = i;
            } else {
                if (i == seats.length - 1)
                    max = Math.max(max, i - start);
            }
            ++i;
        }
        return max;
    }
}
