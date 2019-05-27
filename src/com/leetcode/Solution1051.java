package com.leetcode;

import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * 输入：[1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。
 */
public class Solution1051 {
    public static int heightChecker(int[] heights) {
        //先按照升序排列，再遍历数组统计
        int[] temp = Arrays.copyOf(heights, heights.length);
        int result = 0;
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (temp[i]!=heights[i])
                ++result;
        }
        return result;
    }
}
