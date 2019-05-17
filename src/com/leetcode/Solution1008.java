package com.leetcode;

/**
 * 先序遍历构造二叉树
 * 返回与给定先序遍历 preorder 相匹配的二叉搜索树（binary search tree）的根结点。
 * (回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于 node.left 的任何后代，
 * 值总 < node.val，而 node.right 的任何后代，值总 > node.val。此外，先序遍历首先显示节点的值，
 * 然后遍历 node.left，接着遍历 node.right。）
 * 输入：[8,5,1,7,10,12]
 * 输出：[8,5,10,1,7,null,12]
 */
public class Solution1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int i : preorder) {
            root = createBinarySearchTree(root, i);
        }
        return root;
    }

    private TreeNode createBinarySearchTree(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val>val){
            root.left=createBinarySearchTree(root.left, val);
        }else {
            root.right=createBinarySearchTree(root.right, val);
        }
        return root;
    }
}
