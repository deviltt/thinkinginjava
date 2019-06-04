package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，
 * 第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。）
 * 如果遇到null则置标志位为true，再遇到节点的话结果都返回false
 */
public class Solution958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;   //设置标志位，当遇到null时置位true
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null && flag && (temp.left != null || temp.right != null))  //flag为true时，说明上一层已经不满足满二叉树的要求，而这一层仍然有节点，因此返回false
                return false;
            if (temp != null && temp.left != null) {
                queue.add(temp.left);
            } else {
                flag = true;    //如果没有左节点，则置位true
            }
            if (temp != null && temp.right != null) {
                if (flag)
                    return false;   //如果没有左节点，但是有右节点，显然不满足满二叉树的要求
                else
                    queue.add(temp.right);
            } else {
                flag = true;
            }
        }
        return true;
    }
}
