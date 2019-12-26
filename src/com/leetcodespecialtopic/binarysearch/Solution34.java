package com.leetcodespecialtopic.binarysearch;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 用了模板2的思想
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        //寻找左索引
        int leftIndex = findIndex(nums, target, true);
        //1.
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }
        result[0] = leftIndex;
        result[1] = findIndex(nums, target, false) - 1;
        return result;
    }

    /**
     * @param nums   原数组
     * @param target 目标值
     * @param flag   是否寻找左索引
     * @return
     */
    private int findIndex(int[] nums, int target, boolean flag) {
        int left = 0, right = nums.length;  //2 模板2的情况要考虑右相邻值得情况，因此 right=nums.length
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target || (flag && nums[mid] == target)) {
                right = mid;    //3 如果中值满足条件是要保留当前值的 right=mid
            } else {
                left = mid + 1;     //4 如果中值不满足条件，则直接舍弃当前值即 left=mid+1
            }
        }
        return left;
    }
}
