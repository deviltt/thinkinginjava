package com.leetcode;

/**
 * 给定一个根为 root 的二叉树，每个结点的深度是它到根的最短距离。
 * 如果一个结点在整个树的任意结点之间具有最大的深度，则该结点是最深的。
 * 一个结点的子树是该结点加上它的所有后代的集合。
 * 返回能满足“以该结点为根的子树中包含所有最深的结点”这一条件的具有最大深度的结点。
 * 思路：找到二叉树中某个节点，这个节点包含着所有的最深的节点
 */
public class Solution865 {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int leftDepth = 0, rightDepth = 0;
        if (root == null)
            return null;
        else {
            leftDepth = treeDepth(root.left);
            rightDepth = treeDepth(root.right);
            if (leftDepth == rightDepth)
                return root;
            else if (leftDepth > rightDepth)
                return subtreeWithAllDeepest(root.left);
            else
                return subtreeWithAllDeepest(root.right);
        }
    }

    private int treeDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
    }
}
