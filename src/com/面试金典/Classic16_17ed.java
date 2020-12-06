package com.面试金典;

public class Classic16_17ed {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
