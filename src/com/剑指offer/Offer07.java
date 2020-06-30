package com.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 这题的关键是要确定先序遍历和中序遍历的区间范围
 * 先序遍历的第一个节点就是根节点
 */

public class Offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        //存储元素的位置
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeTool(map, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeTool(Map<Integer, Integer> map, int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        //这个判断条件不能少
        //当1,2 的时候 新的 pl=pr-prNodes+1  pr=pr，此时pl>pr 因此直接返回null，即没有右节点
        if (preLeft > preRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);

        if (preLeft != preRight) {
            int rootIndex = map.get(rootVal);
            int leftNodes = rootIndex - inLeft, rightNodes = inRight - rootIndex;
            root.left = buildTreeTool(map, preorder, preLeft + 1, preLeft + leftNodes, inorder, inLeft, rootIndex - 1);
            root.right = buildTreeTool(map, preorder, preRight - rightNodes + 1, preRight, inorder, rootIndex + 1, inRight);
            return root;
        }
        //当左位置和右位置相等的时候就是根节点的结果
        return root;
    }
}
