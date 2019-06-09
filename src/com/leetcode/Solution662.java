package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
 * 每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
 * 输入:
 * 1
 * / \
 * 3   2
 * /
 * 5
 * 输出: 2
 * 解释: 最大值出现在树的第 2 层，宽度为 2 (3,2)。
 * 思路：记录每个节点的索引值，宽度可以表示为两个节点的索引差值+1
 */
public class Solution662 {
    public int widthOfBinaryTree(TreeNode root) {
        int result = 1; //至少有一个根节点
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> indexList = new LinkedList<>();
        queue.add(root);
        indexList.add(1);   //根节点的索引为1
        int size = 1; //当前队列中的节点数
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            --size;
            int index = indexList.removeFirst();
            if (node != null && node.left != null) {
                indexList.add(2 * index);
                queue.add(node.left);
            }
            if (node != null && node.right != null) {
                indexList.add(2 * index + 1);
                queue.add(node.right);
            }
            if (size == 0) {   //size=0表示这一层的节点数都遍历完了
                if (indexList.size() >= 2) {
                    result = Math.max(result, indexList.getLast() - indexList.getFirst() + 1);
                }
                size = queue.size();
            }
        }
        return result;
    }
}
