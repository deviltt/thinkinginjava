package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后续遍历，必须要定义一个临时节点，用来标记上一个访问的节点
 */
public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode temp = null; //用来标记上一个访问的节点
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.peek();
                if (node.right != null && node.right != temp) {    //当前节点的右子节点没有被访问过的情况
                    node = node.right;
                } else {
                    stack.pop();
                    list.add(node.val);
                    temp = node;    //记录当前访问的节点
                    node = null;
                }
            }
        }
        return list;
    }
}
