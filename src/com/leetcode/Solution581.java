package com.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 */
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int i = 0, j = temp.length - 1;
        while (i < j && temp[i] == nums[i]) {
            i++;
        }
        while (i < j && temp[j] == nums[j]) {
            j--;
        }
        return j - i + 1;
    }
}
