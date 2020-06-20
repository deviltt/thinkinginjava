package com.leetcode;

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private TreeNode dfs(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode tempLeft=root.left;
        TreeNode tempRight=root.right;
        root.left = dfs(tempRight);
        root.right = dfs(tempLeft);
        return root;
    }
}
