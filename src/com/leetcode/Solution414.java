package com.leetcode;

import java.util.Arrays;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int count = 0;
        boolean flag = true;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            /**
             * 这个if是为了满足[1,2,Integer.MIN_VALUE]类似的这种情况
             */
            if (nums[i] == Integer.MIN_VALUE && flag && count < 3) {
                ++count;
                flag = false;
            }
            if (nums[i] > max1) {
                ++count;
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            if (nums[i] > max2 && nums[i] < max1) {
                ++count;
                max3 = max2;
                max2 = nums[i];
            }
            if (nums[i] > max3 && nums[i] < max2) {
                ++count;
                max3 = nums[i];
            }
        }
        return count >= 3 ? max3 : max1;
    }
}
