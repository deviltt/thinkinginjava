package com.剑指offer;

/**
 * 剑指 Offer 26. 树的子结构
 */
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return A != null && B != null && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }

        return recur(a.left, b.left) && recur(a.right, b.right);
    }   //保证每次线序遍历时，都满足b是a子树的条件
}
