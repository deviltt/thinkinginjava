package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 二叉树的堂兄弟节点
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 * 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
 * 输入：root = [1,2,3,4], x = 4, y = 3
 * 输出：false
 * 分别用map记录该节点值对应的父节点和深度
 */
public class Solution993 {
    Map<Integer, TreeNode> parent;
    Map<Integer, Integer> depth;

    public boolean isCousins(TreeNode root, int x, int y) {
        parent = new HashMap<>();
        depth = new HashMap<>();
        dfs(root, null);
        return (parent.get(x) != parent.get(y)) && (depth.get(x) == depth.get(y));
    }

    /**
     * 深度遍历，记录每个节点的父节点和深度，根节点的父节点为null
     *
     * @param root
     * @param par
     */
    private void dfs(TreeNode root, TreeNode par) {
        if (root != null) {
            depth.put(root.val, par == null ? 0 : depth.get(par.val) + 1);//当前节点的深度为父节点的深度+1
            parent.put(root.val, par);
            dfs(root.left, root);
            dfs(root.right, root);
        }
    }
}
