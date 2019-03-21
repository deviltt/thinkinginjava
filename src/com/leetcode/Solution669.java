package com.leetcode;

/**
 * 输入:
 *     3
 *    / \
 *   0   4
 *    \
 *     2
 *    /
 *   1
 *   L = 1
 *   R = 3
 * 输出:
 *       3
 *      /
 *    2
 *   /
 *  1
 */
public class Solution669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;
        //如果根节点大于右区间，则返回的根节点一定在树的左边
        if (root.val > R)
            return trimBST(root.left, L, R);
        if (root.val < L)
            return trimBST(root.right, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
