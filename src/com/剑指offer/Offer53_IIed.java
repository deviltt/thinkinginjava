package com.剑指offer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * 二分法
 */
public class Offer53_IIed {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            int m = (j - i) / 2 + i;
            if (nums[m] == m) {
                i = m + 1;
            }else{
                j = m - 1;
            }
        }
        return i;
    }
}
