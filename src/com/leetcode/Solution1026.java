package com.leetcode;

/**
 * 给定二叉树的根节点 root，找出存在于不同节点 A 和 B 之间的最大值 V，其中 V = |A.val - B.val|，且 A 是 B 的祖先。
 * （如果 A 的任何子节点之一为 B，或者 A 的任何子节点是 B 的祖先，那么我们认为 A 是 B 的祖先）
 * 输入：[8,3,10,1,6,null,14,null,null,4,7,13]
 * 输出：7
 * 解释：
 * 我们有大量的节点与其祖先的差值，其中一些如下：
 * |8 - 3| = 5
 * |3 - 7| = 4
 * |8 - 1| = 7
 * |10 - 13| = 3
 * 在所有可能的差值中，最大值 7 由 |8 - 1| = 7 得出。
 * 记录每一个遍历链上的最大值和最小值
 */
public class Solution1026 {
    private int maxResult = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, 100001, 0);
        return maxResult;
    }

    private void dfs(TreeNode root, int min, int max) {
        if (root == null){
            maxResult = Math.max(maxResult, max - min);
            return;
        }
        if (root.val < min)
            min = root.val;
        if (root.val > max)
            max = root.val;
        dfs(root.left, min, max);
        dfs(root.right, min, max);
    }
}
