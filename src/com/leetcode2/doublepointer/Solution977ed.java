package com.leetcode2.doublepointer;

/**
 * 977. 有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * <p>
 * 关键点是要想到，负数的平方是按逆序排列，正数的平方是按正序排列，然后再使用双指针
 */
public class Solution977ed {
    public static int[] sortedSquares(int[] A) {
        int i = 0, N = A.length;
        // j<N 使用了短路规则，为了符合边界条件
        while (i < N && A[i] < 0) {
            ++i;
        }
        int j = i - 1;
        int[] result = new int[N];
        int t = 0;
        while (j >= 0 && i < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                result[t++] = A[i] * A[i];
                ++i;
            } else {
                result[t++] = A[j] * A[j];
                --j;
            }
        }
        while (j >= 0) {
            result[t++] = A[j] * A[j];
            --j;
        }
        while (i < N) {
            result[t++] = A[i] * A[i];
            ++i;
        }
        return result;
    }
}
