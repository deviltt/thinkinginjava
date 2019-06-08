package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 翻转二叉树以匹配先序遍历
 * 输入：root = [1,2,3], voyage = [1,3,2]
 * 输出：[1]
 */
public class Solution971 {
    private List<Integer> result;
    private int index;
    private int[] voyage;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        result = new ArrayList<>();
        index = 0;
        this.voyage = voyage;
        flip(root);
        return result;
    }

    private void flip(TreeNode root) {
        if (root == null)
            return;
        if (root.val != voyage[index++]) {
            result.clear();
            result.add(-1);
            return;
        }
        if (index<voyage.length&&root.left!=null&&root.left.val!=voyage[index]) {
            result.add(root.val);   //要反转的节点添加进List集合
            flip(root.right);
            flip(root.left);
        } else {
            flip(root.left);
            flip(root.right);
        }
    }
}
