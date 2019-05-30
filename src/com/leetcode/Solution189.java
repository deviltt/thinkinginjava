package com.leetcode;

/**
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length)
            k %= nums.length;
        if (k != 0) {
            rotate(nums, 0, nums.length - k - 1);
            rotate(nums, nums.length - k, nums.length - 1);
            rotate(nums, 0, nums.length - 1);
        }
    }

    /**
     * 中心旋转一个数组
     *
     * @param nums
     */
    private void rotate(int[] nums, int left, int right) {
        int temp = 0;
        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            ++left;
            --right;
        }
    }
}
