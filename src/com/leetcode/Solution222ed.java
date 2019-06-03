package com.leetcode;

/**
 * 1.分别计算左子树和右子树的高度
 * 2.如果左右子树的高度相同，表明左子树一定是满二叉树
 * 3.如果左子树高度大于右子树，表明右子树一定是满二叉树
 */
public class Solution222ed {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if (leftDepth == rightDepth)
            return 1 + 1 << leftDepth - 1 + countNodes(root.right); //左子树是满二叉树:1(根节点)+ (1<<leftDepth) - 1 + 右子树的节点个数
        else
            return 1 + 1 << rightDepth - 1 + countNodes(root.left);
    }

    private int depth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            ++depth;
            node = node.left;
        }
        return depth;
    }
}
