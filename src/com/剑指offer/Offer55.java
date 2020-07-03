package com.剑指offer;

/**
 * 时间复杂度分析：
 * isBalanced要把所有节点都考虑一遍，因此是O(N)
 * 每一次执行isBalanced，都要执行 N/2 个节点
 * 假设一共t次，那么 N/2^t=1  =>  t=logN
 * 因此复杂度是 NlogN
 */
public class Offer55 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        //后面两个条件表示判断所有节点都是平衡节点，不可缺少
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 主要作用是计算二叉树的深度
     *
     * @param root
     * @return
     */
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(dfs(root.left), dfs(root.right)) + 1;
    }
}
