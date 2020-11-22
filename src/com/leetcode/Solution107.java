package com.leetcode;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II
 * 层序遍历法
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int count;    //记录每一层有多少个节点
        queue.add(root);
        while (!queue.isEmpty()) {
            count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count != 0) {
                TreeNode temp = queue.poll();
                --count;
                list.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}
