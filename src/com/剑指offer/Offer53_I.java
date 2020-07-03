package com.剑指offer;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 */
public class Offer53_I {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] == target) {
                //右缩
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        int right = i;
        //提前返回的情况，没有这一行也可以
        if (j >= 0 && nums[j] != target) {
            return 0;
        }
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] == target) {
                //左缩
                j = mid - 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        int left = j;
        return right - left - 1;
    }
}
