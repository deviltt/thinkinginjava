package com.leetcode;

/**
 * 目标和
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。
 * 现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 * 输入: nums: [1, 1, 1, 1, 1], S: 3
 * 输出: 5
 * 解释:
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 一共有5种方法让最终目标和为3。
 */
public class Solution494 {
    private int count;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, 0, target);
        return count;
    }

    private void dfs(int[] nums, int index, int target) {
        if (index==nums.length){
            if (target==0)
                count++;
        }else {
            dfs(nums, index+1, target+nums[index]);
            dfs(nums, index+1, target-nums[index]);
        }
    }
}
