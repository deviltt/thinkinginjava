package com.leetcodespecialtopic.binarysearch;

/**
 * 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        int middle, left = 0, right = nums.length - 1;
        //这里不能是 left<right, 当nums.length为1或者2时就会出现错误
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
