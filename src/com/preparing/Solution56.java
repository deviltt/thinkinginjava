package com.preparing;

import com.tt.chapter14.typeinfo.pets.Manx;

import java.util.Arrays;
import java.util.Comparator;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[][] result = new int[intervals.length][intervals[0].length];
        int[] temp = new int[intervals[0].length];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        int index = 0;
        for (int i = 1; i < result.length; i++) {
            if (intervals[i][0] <= temp[1]) {
                //合并区间
                temp[0] = Math.min(temp[0], intervals[i][0]);
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                result[index][0] = temp[0];
                result[index++][1] = temp[1];
                temp[0] = intervals[i][0];
                temp[1] = intervals[i][1];
            }
        }
        intervals[index][0] = temp[0];
        intervals[index++][1] = temp[1];

        int[][] ans = new int[index][intervals[0].length];
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                ans[i][j] = result[i][j];
            }
        }
        return ans;
    }
}
