package com.leetcode;

/**
 * 插入区间
 */
public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            intervals=new int[1][2];
            intervals[0][0] = newInterval[0];
            intervals[0][1] = newInterval[1];
            return intervals;
        }

        //创建一个新的数组用来存放插入结果
        int[][] resultIntervals = new int[intervals.length + 1][intervals[0].length];

        int index = 0, resultIndex=0;

        while (index < intervals.length && newInterval[0] > intervals[index][1]) {
            resultIntervals[resultIndex][0] = intervals[index][0];
            resultIntervals[resultIndex++][1] = intervals[index++][1];
        }

        while (index < intervals.length && newInterval[1] >= intervals[index][0]) {
            newInterval[0]=Math.min(intervals[index][0], newInterval[0]);
            newInterval[1]=Math.max(intervals[index++][1], newInterval[1]);
        }

        //添加到结果数组中
        resultIntervals[resultIndex][0]=newInterval[0];
        resultIntervals[resultIndex++][1]=newInterval[1];

        while (index<intervals.length){
            resultIntervals[resultIndex][0]=intervals[index][0];
            resultIntervals[resultIndex++][1]=intervals[index++][1];
        }

        int[][] ans=new int[resultIndex][intervals[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j]=resultIntervals[i][j];
            }
        }
        return ans;
    }
}
