package com.剑指offer;

/**
 * 二叉树的镜像
 */
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode temp=new TreeNode(root.val);
        temp.left=mirrorTree(root.right);
        temp.right=mirrorTree(root.left);

        return temp;
    }
}
