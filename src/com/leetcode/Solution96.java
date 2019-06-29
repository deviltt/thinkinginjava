package com.leetcode;

/**
 * 推导递推公式
 * Gn表示当节点数为n时，一共有多少种二叉搜索树
 * Gn=f0+f1+...+fn  (fn表示当n作为根节点时的二叉搜索树种类数)
 * fi表示以i作为根节点时的二叉搜索树种类数，fi=G(i-1)G(n-i)
 * (i-1个节点有G(i-1)种二叉搜索树，每种都对应着G(n-i)种二叉搜索树，因此一共有G(i-1)G(n-i)种
 */
public class Solution96 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j] * dp[i - j - 1];

        return dp[n];
    }
}
