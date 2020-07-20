package com.leetcode;

/**
 * 1379. 找出克隆二叉树中的相同节点
 * 两棵树同时先序遍历
 */
public class Solution1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode treeNode = getTargetCopy(original.left, cloned.left, target);
        if (treeNode != null) {
            //只要存在就直接返回
            return treeNode;
        }
        treeNode = getTargetCopy(original.right, cloned.right, target);
        if (treeNode != null) {
            return treeNode;
        }
        return null;
    }
}
