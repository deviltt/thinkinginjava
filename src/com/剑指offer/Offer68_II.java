package com.剑指offer;

/**
 * 面试题68 - II. 二叉树的最近公共祖先
 */
public class Offer68_II {
    private TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p.val, q.val);
        return result;
    }

    /**
     * 后续遍历
     *
     * @param root 根节点
     * @param val1 值1，需要和当前root的val进行比较
     * @param val2 值2
     * @return 返回bool值
     */
    private boolean dfs(TreeNode root, int val1, int val2) {
        if (root == null) {
            return false;
        }

        boolean leftFlag = dfs(root.left, val1, val2);
        boolean rightFlag = dfs(root.right, val1, val2);

        //这里最近公共祖先有两种情况
        //1.左右子树都返回true
        //2.左右子树中的一个返回true，且根节点本身就是最近公共节点的情况
        if (leftFlag && rightFlag || (root.val == val1 || root.val == val2) && (leftFlag || rightFlag)) {
            result = root;
        }

        //返回时候不但要考虑左右子树，还要考虑节点本身
        return leftFlag || rightFlag || (root.val == val1 || root.val == val2);
    }
}
