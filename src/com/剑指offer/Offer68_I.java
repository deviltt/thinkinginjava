package com.剑指offer;

public class Offer68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

}
