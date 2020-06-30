package com.剑指offer;

/**
 * 和为s的两个数字
 * 双指针相向运动的思想
 */
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int p = 0, q = nums.length - 1;
        int sum = 0;
        while (p < q) {
            sum = nums[p] + nums[q];
            if (sum < target) {
                ++p;
            } else if (sum > target) {
                --q;
            } else {
                return new int[]{nums[p], nums[q]};
            }
        }
        return null;
    }
}
