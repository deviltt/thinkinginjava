package com.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上到下打印二叉树 II
 */
public class Offer32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count;  //count用来记录还剩多少节点
        int tempCount = 1;  //tempCount用来记录二叉树的每一行有多少个节点

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            count = tempCount;
            tempCount = 0;
            while (count != 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                    ++tempCount;
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                    ++tempCount;
                }
                list.add(temp.val);
                --count;
            }
            ans.add(list);
        }
        return ans;
    }
}
