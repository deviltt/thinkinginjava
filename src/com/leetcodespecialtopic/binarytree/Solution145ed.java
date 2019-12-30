package com.leetcodespecialtopic.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
public class Solution145ed {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode temp = null;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                //当左子树为空的时候，如果右节点被访问过了，就弹出根节点
                node = stack.peek();
                if (node.right != null && node.right != temp) {
                    node = node.right;  //当右节点已经访问过的话，就不需要再遍历右节点了
                } else {
                    stack.pop();
                    list.add(node.val);
                    temp = node;
                    node = null;
                }
            }
        }
        return list;
    }
}
