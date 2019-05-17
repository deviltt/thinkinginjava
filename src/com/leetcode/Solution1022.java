package com.leetcode;

/**
 * 从根到叶的二进制数之和
 * 给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。
 * 例如，如果路径为 0 -> 1 -> 1 -> 0 -> 1，那么它表示二进制数 01101，也就是 13 。
 * 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。
 * 以 10^9 + 7 为模，返回这些数字之和。
 * 输入：[1,0,1,0,1,0,1]
 * 输出：22
 * 解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 */
public class Solution1022 {
    private int sum;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int oldValue) {
        if (root == null)
            return;
        int newValue = oldValue << 1 | root.val;
        //如果是根节点
        if (root.left == null && root.right == null) {
            sum += newValue;
        } else {
            dfs(root.left, newValue);
            dfs(root.right, newValue);
        }
    }
}
