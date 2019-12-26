package com.leetcodespecialtopic.binarysearch;

/**
 * 162. 寻找峰值
 * 峰值元素是指其值大于左右相邻值的元素。
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 * 你可以假设 nums[-1] = nums[n] = -∞。
 * 输入: nums = [1,2,3,1]
 * 输出: 2
 * 解释: 3 是峰值元素，你的函数应该返回其索引 2。
 */
public class Solution162 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1; //当前值肯定不是峰值，因此直接舍弃
            } else {
                right = mid;    //因为当前值可能就是峰值，所以不能写成 right=mid-1;
            }
        }
        return left;
    }
}
