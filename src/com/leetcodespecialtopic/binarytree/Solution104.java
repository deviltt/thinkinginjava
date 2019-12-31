package com.leetcodespecialtopic.binarytree;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class Solution104 {
    private int max = 0;

    public int maxDepth(TreeNode root) {
        depth(root, 1);
        return max;
    }

    /**
     * 先序遍历的方法，遇到叶子节点的时候 更新 最大深度
     * @param root 根节点
     * @param depth 树的深度
     */
    private void depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            max = Math.max(max, depth);
        }
        depth(root.left, depth + 1);
        depth(root.right, depth + 1);
    }
}
