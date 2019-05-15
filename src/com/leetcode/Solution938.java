package com.leetcode;

/**
 * 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 */
public class Solution938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        int count = 0;
        if (root.val >= L && root.val <= R)
            count += root.val;
        return count + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
