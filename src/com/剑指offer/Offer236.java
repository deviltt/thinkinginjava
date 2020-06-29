package com.剑指offer;

/**
 * 最近公共节点
 * 满足条件的一共有三种情况：
 * 1. 最近公共节点为root，其它两个节点分别在左右子树中，lFlag && rFlag
 * 2. 最近公共节点为root，刚好等于左节点，或者刚好等于右节点，(root.val==p.val || root.val== q.val)&&(lFlag || rFlag)
 */
public class Offer236 {
    private TreeNode ans;

    public Offer236() {
        this.ans = new TreeNode(-1);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    /**
     * 后续遍历二叉树
     *
     * @param root 根节点
     * @param p
     * @param q
     * @return
     */
    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        boolean lFlag = dfs(root.left, p, q);
        boolean rFlag = dfs(root.left, p, q);

        if (lFlag && rFlag || ((root.val == p.val || root.val == q.val) && (lFlag || rFlag))) {
            ans = root;
        }

        //当返回到根节点时，首先判断左右子树是否有满足条件（等于p或者q的节点）
        //没有的话判断root节点是否等于任意一个p、q
        //只要满足一个就返回true
        return lFlag || rFlag || (root.val == p.val || root.val == q.val);
    }
}
