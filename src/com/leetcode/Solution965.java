package com.leetcode;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * 输入：[2,2,2,5,2]
 * 输出：false
 * 思路：先保存一个值，遇到不同的就返回false
 */
public class Solution965 {
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isUnival(root, val);
    }

    private boolean isUnival(TreeNode root, int val) {
        if (root == null)
            return true;
        if (root.val != val)
            return false;
        return isUnival(root.left, val) && isUnival(root.right, val);
    }
}
