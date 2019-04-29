package com.leetcode;

/**
 * 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * 输出: 6
 * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 * 思路:使用dp数组来保存每一个台阶的最小值的dp[i]=cost[i]+min(dp[i-1], dp[i-2]);
 */
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
//        int[] dp = new int[cost.length];
//        dp[0] = cost[0];
//        dp[1] = cost[1];
//        for (int i = 2; i < cost.length; i++) {
//            //cost[i]为当前台阶所消耗的体力值
//            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
//        }
//        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
        /**
         * 思路2：思路1中是要开辟一个和cost数组同样长度的数组，
         * 而在dp数组中，之前用过的值便没有存在的意义，不会再使用到了，
         * 因此可以只保留i-1, i-2中的小者就行
         */
        int a = cost[0];
        int b = cost[1];
        int t;
        for (int i = 2; i < cost.length; i++) {
            t = cost[i] + Math.min(a, b);
            a = b;
            b = t;
        }
        return Math.min(a, b);
    }
}
