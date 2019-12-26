package com.leetcodespecialtopic.binarysearch;

/**
 * 33. 搜索旋转排序数组
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是O(log n)级别。
 * 输入: nums = [4,5,6,7,0,1,2],target = 0
 * 输出: 4
 */
public class Solution33 {
    private int[] nums;
    private int target;

    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        int n = nums.length;
        if (n == 0) {
            return -1;
        } else if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        //1. 寻找中枢点 O(logN)
        int pivot = findPivot(0, n - 1);
        //2. 判断target是在中枢点的左区间还是右区间
        if (target == nums[pivot]) {
            return pivot;
        }
        //pivot==0 表示没有旋转
        if (pivot == 0) {
            return findTargetIndex(0, n - 1);   //O(logN)
        }
        if (target < nums[0]) {
            return findTargetIndex(pivot, n - 1);
        }
        return findTargetIndex(0, pivot - 1);
    }

    private int findTargetIndex(int l, int r) {
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    private int findPivot(int l, int r) {
        if (nums[l] < nums[r]) {
            return 0;
        }
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else {
                if (nums[mid] < nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return 0;
    }
}
