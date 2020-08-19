package com.剑指offer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */
public class Offer53_II {
    public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 1) {
                return i;
            }
        }
        return -1;
    }
}
