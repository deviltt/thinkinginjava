package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
 * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 * 输入:
 * 1
 * / \
 * 2   3
 * / \  /
 * 4  5 6
 * 输出: 6
 * <p>
 * 思路1：层序遍历满二叉树，计算队列中的节点个数
 */
public class Solution222 {
    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ++count;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null && temp.left != null) {
                queue.add(temp.left);
                ++count;
            }
            if (temp != null && temp.right != null) {
                queue.add(temp.right);
                ++count;
            }
        }
        return count;
    }
}
