package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入: [[1,2], [2,3], [3,4]]
 * 输出: 2
 * 解释: 最长的数对链是 [1,2] -> [3,4]
 */
public class Solution646 {
    public static int findLongestChain(int[][] pairs) {
        /**
         *  为什么依据第二个参数来进行排序，因为数对链是将第二个参数
         *  与下一个数组的第一个参数进行比较，因此最开始肯定是拿第二
         *  个参数的最小值进行比较
         */
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int temp = pairs[0][1];
        int res = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (temp < pairs[i][0]) {
                ++res;
                temp = pairs[i][1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints={{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};
        int result=findLongestChain(ints);



        System.out.println(ints);
    }
}
