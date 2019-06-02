package com.leetcode;

/**
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 * 返回 3。和等于 8 的路径有:
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 *
 * 双重递归：首先先序递归遍历每个节点
 * 再以该节点为起始点递归计算
 */
public class Solution437 {
    private int count;

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        countSum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    private void countSum(TreeNode root, int sum) {
        if (root == null)
            return;

        if (root.val == sum)
            ++count;
        countSum(root.left, sum - root.val);
        countSum(root.right, sum - root.val);
    }
}
