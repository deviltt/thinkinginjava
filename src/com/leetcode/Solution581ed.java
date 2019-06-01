package com.leetcode;

/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 */
public class Solution581ed {
    public int findUnsortedSubarray(int[] nums) {
        int p = 0, q = nums.length - 1;
        while (p < nums.length - 1) {
            if (nums[p + 1] >= nums[p])
                ++p;
            else
                break;
        }
        while (q > 0) {
            if (nums[q] >= nums[q - 1])
                --q;
            else
                break;
        }

        //如果p、q范围内有比nums[p]小或者比nums[q]大的
        if (p >= q)
            return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = p; i <= q; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        while (p > 0) {
            if (min < nums[p - 1])
                --p;
            else
                break;
        }
        while (q < nums.length - 1) {
            if (max > nums[q + 1])
                ++q;
            else break;
        }
        return q - p + 1;
    }
}
