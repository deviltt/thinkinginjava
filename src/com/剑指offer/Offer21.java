package com.剑指offer;

/**
 *  调整数组顺序使奇数位于偶数前面
 *  快慢指针法
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int odd = 0, even = 0;  //odd奇数指针的位置，even偶数指针的位置

        while (even < nums.length) {
            if (nums[even] % 2 != 0) {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                ++odd;
            }
            ++even;
        }
        return nums;
    }
}
