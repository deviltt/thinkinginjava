package com.剑指offer;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列(递归方法)
 * 重点是查找左右子树的分界点
 * 按照二叉搜索数的定理，左子树所有节点一定比根节点小
 * 而右子树的所有节点一定比根节点大
 */
public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder, 0, postorder.length - 1);
    }

    private boolean dfs(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int start = i;
        while (postorder[i] < postorder[j]) {
            ++i;
        }
        int mid = i;
        while (postorder[i] > postorder[j]) {
            ++i;
        }

        return i == j && dfs(postorder, start, mid - 1) && dfs(postorder, mid, j - 1);
    }
}
