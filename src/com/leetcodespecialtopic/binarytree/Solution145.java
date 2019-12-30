package com.leetcodespecialtopic.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [3,2,1]
 */
public class Solution145 {
    private List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }

    private void postorder(TreeNode root) {
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }
}
