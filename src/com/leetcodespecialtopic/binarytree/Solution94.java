package com.leetcodespecialtopic.binarytree;


import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [1,3,2]
 */
public class Solution94 {
    private List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }

    private void inorder(TreeNode node){
        if (node==null){
            return;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
}
