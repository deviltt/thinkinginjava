package com.剑指offer;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 亮点：
 * 反过来的中序遍历，这样元素就是逆序输出
 * 正向的中序遍历，元素是顺序输出
 */
public class Solution54 {
    private int result, tempK;

    public int kthLargest(TreeNode root, int k) {
        this.tempK = k;
        dfs(root);

        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (tempK == 0) {
            return;
        }
        if (--tempK == 0) {
            result = root.val;
        }
        dfs(root.left);
    }
}
