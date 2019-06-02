package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 * 给定如下二叉树，以及目标和 sum = 22，
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 */
public class Solution113 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)
            return res;
        List<Integer> list = new ArrayList<>();
        traverse(root, sum, list);
        return res;
    }

    private void traverse(TreeNode root, int sum, List<Integer> list) {
        if (root.left == null && root.right == null) {
            if (root.val==sum){
                list.add(root.val);
                res.add(list);
            }
            return;
        }
        list.add(root.val);
        if (root.left != null && root.right != null) {
            List<Integer> list1 = new ArrayList<>(list);
            traverse(root.left, sum - root.val, list);   //这一步操作过后list的值就改变了，因此要备份一个
            traverse(root.right, sum - root.val, list1);
        } else if (root.left == null) {
            traverse(root.right, sum - root.val, list);
        } else {
            traverse(root.left, sum - root.val, list);
        }
    }
}
