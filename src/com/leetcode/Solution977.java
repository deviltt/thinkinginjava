package com.leetcode;

import java.util.Arrays;

/**
 * 有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * 思路：遍历数组，使每个元素平方，在重排序数组即可
 */
public class Solution977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)Math.pow(A[i], 2);
        }
        Arrays.sort(A);
        return A;
    }
}
