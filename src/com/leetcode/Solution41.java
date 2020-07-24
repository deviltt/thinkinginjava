package com.leetcode;

/**
 * 41. 缺失的第一个正数(方法1)
 * 如果一个都不缺失，数组的长度是n，那数组里面的数就是1 ~ n
 * 如果有缺失，那么把除了 1 ~ n之外的数都用一种方式过滤掉
 * 然后按照数组下标把 1 ~ n 下标的对应值变为负数
 * 表示这个数 是没有缺失的
 * 最后遍历数组，第一个大于0的数的下标 + 1 就是结果
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        //遍历数组，把小于0的数都变成大于nums长度的正数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = length + 1;
            }
        }
        //遍历数组，把在 1到n 范围的数对应的数组下标的数变成负数
        for (int i = 0; i < length; i++) {
            int num = Math.abs(nums[i]);
            if (num <= length) {
                nums[num - 1] = -(Math.abs(nums[num - 1])); //因为其本身可能已经是负数了，如果直接取反，则原来的负数会变成正数，影响最终的结果
            }
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return length + 1;
    }
}
