package com.剑指offer;

public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode l, TreeNode r) {
        //终止条件1.两个节点都是null的时候，走到这一步说明之前的节点都满足情况
        if (l == null && r == null) {
            return true;
        }

        //终止条件2.不对称的时候直接返回false
        if (l == null || r == null || l.val != r.val) {
            return false;
        }

        //否则一直递归下去
        return dfs(l.left, r.right) && dfs(l.right, r.left);
    }
}
