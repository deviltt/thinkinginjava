package com.leetcode2;

public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target && nums[left] > target) {
                left = mid + 1;
            } else if (nums[mid] > target && nums[left] < target) {
                right = mid - 1;
            } else if (nums[mid] < target && nums[right] < target) {
                right = mid - 1;
            } else if (nums[mid] < target && nums[right] > target) {
                left = mid + 1;
            }else if (nums[left]==target){
                return left;
            }else if (nums[right]==target){
                return right;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
