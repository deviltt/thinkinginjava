package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 107. 二叉树的层次遍历 II
 * 递归法(深度遍历)
 */
public class Solution107ed {
    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return lists;
        }
        dfs(root, 0);
        Collections.reverse(lists);
        return lists;
    }

    /**
     * 先序遍历
     */
    private void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        List<Integer> list;
        if (lists.size()==level) {
            list = new ArrayList<>();
            list.add(node.val);
            lists.add(list);
        } else {
            lists.get(level).add(node.val);
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
