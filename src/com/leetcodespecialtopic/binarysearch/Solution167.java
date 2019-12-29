package com.leetcodespecialtopic.binarysearch;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int sum;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum > target) {
                --right;
            } else {
                ++left;
            }
        }
        return null;
    }
}
