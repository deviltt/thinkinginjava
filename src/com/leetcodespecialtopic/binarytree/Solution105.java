package com.leetcodespecialtopic.binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 注意:
 * 你可以假设树中没有重复的元素。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 最重要的是确定根节点的位置，以及左右子树的区间范围
 */
public class Solution105 {
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //记录中序遍历数组中元素值对应数组中的位置索引
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return help(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode help(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode node = new TreeNode(pre[preStart]);
        int index = map.get(pre[preStart]);
        node.left = help(pre, preStart + 1, preStart + index - inStart, in, inStart, index - 1);
        node.right = help(pre, preStart + index - inStart + 1, preEnd, in, index + 1, inEnd);
        return null;
    }
}
