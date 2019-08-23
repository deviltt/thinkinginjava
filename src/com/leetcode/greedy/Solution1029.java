package com.leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 *
 * 思路：如果所有人都飞A城，那么就需要调度一半的人到B城，如何调度？
 * 肯定是优先选择 priceB-priceA 最小的
 */
public class Solution1029 {
    public int twoCitySchedCost(int[][] costs) {
        int result = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1] - o1[0]) - (o2[1] - o2[0]);
            }
        });
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                result += costs[i][1];
            } else {
                result += costs[i][0];
            }
        }
        return result;
    }
}
