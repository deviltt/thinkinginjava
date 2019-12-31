package com.leetcodespecialtopic.binarytree;

/**
 * 后序遍历的方式，取左右子树的最大值
 */
public class Solution104ed {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
