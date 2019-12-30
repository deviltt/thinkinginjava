package com.leetcodespecialtopic.binarysearch;

/**
 * 287. 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * 示例 1:
 * 输入: [1,3,4,2,2]
 * 输出: 2
 */
public class Solution287 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        //1. 找到相交的位置
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow!=fast);
        int pre1 = nums[0], pre2 = slow;
        //2. 寻找入口点
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }
}
