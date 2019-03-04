package com.leetcode;

/**
 * 求众数
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        int result = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0){
                result = nums[i];
                count++;
            }else if (result == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return result;
    }
}
