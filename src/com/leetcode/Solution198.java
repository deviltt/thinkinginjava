package com.leetcode;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是
 * 相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * 思路状态转移方程 f(n)=max(f(n-1), f(n-2)+a(n))
 */
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length <= 1)
            return nums.length == 0 ? 0 : nums[0];
        if (nums.length == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];
        int a = nums[0], b = Math.max(a, nums[1]), temp = 0;
        for (int i = 2; i < nums.length; i++) {
            temp = Math.max(b, a + nums[i]);
            a = b;
            b = temp;
        }
        return Math.max(a, b);
    }
}
