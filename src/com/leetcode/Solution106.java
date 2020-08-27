package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 */
public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        //记录中序遍历元素位置
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return dfs(map, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode dfs(Map<Integer, Integer> map, int[] inorder, int inL, int inR, int[] postorder, int pL, int pR) {
        //当为空节点的时候，pL>pR-rightNodes-1
        if (pL > pR) {
            return null;
        }
        int rootVal = postorder[pR];
        TreeNode root = new TreeNode(rootVal);

        if (pL < pR) {
            int index = map.get(rootVal);
            int rightNodes = inR - index;
            root.left = dfs(map, inorder, inL, index - 1, postorder, pL, pR - rightNodes - 1);
            root.right = dfs(map, inorder, index + 1, inR, postorder, pR - rightNodes, pR - 1);
            return root;
        }
        return root;    //pL==pR 的时候，pL==pR-rightNodes-1，即只有一个节点，且这个节点没有子节点
    }
}
