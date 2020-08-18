package com.剑指offer;

import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 先排序的方法
 */
public class Offer61ed {
    public boolean isStraight(int[] nums) {
        int index = 0;    //计数有多少个joker
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                ++index;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[index] <= 4;
    }
}
