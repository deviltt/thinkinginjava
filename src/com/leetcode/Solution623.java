package com.leetcode;

/**
 * 在二叉树中增加一行
 * 给定一个二叉树，根节点为第1层，深度为 1。在其第 d 层追加一行值为 v 的节点。
 * 添加规则：给定一个深度值 d （正整数），针对深度为 d-1 层的每一非空节点 N，为 N 创建两个值为 v 的左子树和右子树。
 * 将 N 原先的左子树，连接为新节点 v 的左子树；将 N 原先的右子树，连接为新节点 v 的右子树。
 * 如果 d 的值为 1，深度 d - 1 不存在，则创建一个新的根节点 v，原先的整棵树将作为 v 的左子树。
 * 输入:
 * 二叉树如下所示:
 *        4
 *      /   \
 *     2     6
 *    / \   /
 *   3   1 5
 * v = 1
 * d = 2
 * 输出:
 *        4
 *       / \
 *      1   1
 *     /     \
 *    2       6
 *   / \     /
 *  3   1   5
 */
public class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        int depth = 1;
        return dfs(root, v, d, depth, 0);   //dir记录是从左子树还是右子树开始遍历的
    }

    private TreeNode dfs(TreeNode root, int v, int d, int depth, int dir) {
        //满足测试用例[1,2,3,4] v=5 d=4，即树的深度比d要小时
        if (root == null && depth == d) {
            return new TreeNode(v);
        }
        //满足测试用例[4,2,null,null,3,1] v=1 d=3，即右子树不存在时
        if (root == null)
            return null;
        if (d == depth) {
            TreeNode node = new TreeNode(v);
            if (dir == 0) {
                node.left = root;
            } else {
                node.right = root;
            }
            return node;
        }
        root.left = dfs(root.left, v, d, depth + 1, 0);
        root.right = dfs(root.right, v, d, depth + 1, 1);
        return root;
    }
}
