package com.preparing;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            intervals = new int[1][2];
            intervals[1][0] = newInterval[0];
            intervals[1][1] = newInterval[1];
            return intervals;
        }

        int[][] result = new int[intervals.length + 1][intervals[0].length];
        int index = 0, resultIndex = 0;

        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            result[resultIndex][0] = intervals[index][0];
            result[resultIndex++][1] = intervals[index++][1];
        }

        //到了这一步 newIntervals[0] <= intervals[index][1] 是肯定的
        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index++][1], newInterval[1]);
        }
        result[resultIndex][0] = newInterval[0];
        result[resultIndex++][1] = newInterval[1];

        while (index<intervals.length){
            result[resultIndex][0]=intervals[index][0];
            result[resultIndex++][1]=intervals[index++][1];
        }
        int[][] ans=new int[resultIndex][intervals[0].length];
        for (int i = 0; i < resultIndex; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                ans[i][j]=result[i][j];
            }
        }
        return ans;
    }
}
