package com.leetcode2;

/**
 * 238. 除自身以外数组的乘积
 * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        //保存左积
        for (int i = 0; i < nums.length; i++) {
            res[i] = k;
            k *= nums[i];
        }
        k = 1;
        //保存右积
        for (int i = nums.length - 1; i > 0; i--) {
            res[i] *= k;
            k *= nums[i];
        }
        return res;
    }
}
