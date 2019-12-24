package com.leetcode2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 56. 合并区间
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        //1.将原来的二维数组按照第一个元素进行升序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[][] result = new int[intervals.length][intervals[0].length];
        int[] temp = new int[intervals[0].length];    //temp的作用是滑动区间，记录当前的区间
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        int index = 0;
        for (int i = 1; i < result.length; i++) {
            //如果后一个区间的最小值小于等于前一个区间的最大值，就合并两个区间
            if (intervals[i][0] <= temp[1]) {
                temp[0] = Math.min(temp[0], intervals[i][0]);
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                result[index][0] = temp[0];
                result[index][1] = temp[1];
                ++index;
                temp[0] = intervals[i][0];
                temp[1] = intervals[i][1];
            }
        }
        //最后一组还没有添加
        result[index][0] = temp[0];
        result[index++][1] = temp[1];
        //因为result的数组大小和intervals是一样的，如果有数组合并的话，数组长度肯定会缩小，导致后面几个数组都是0，不符合结果
        //因此要重新建一个index大小的数组
        int[][] ans = new int[index][intervals[0].length];
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                ans[i][j] = result[i][j];
            }
        }
        return ans;
    }
}
