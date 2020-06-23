package com.剑指offer;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 * 后序遍历
 */
public class Offer55_Ied {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //当前节点的左右子子树的深度
//        int leftLen = maxDepth(root.left);
//        int rightLen = maxDepth(root.right);
//
//        return Math.max(leftLen, rightLen) + 1;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
