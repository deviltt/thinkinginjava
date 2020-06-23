package com.剑指offer;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 * 先序遍历
 */
public class Offer55_I {
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        maxDepth = Math.max(depth, maxDepth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
