package com.剑指offer;

import java.util.*;

public class Offer32_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int reverse = 1, count = 0, tempCount = 1; //分奇偶数
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = tempCount; i > 0; i--) {
                TreeNode temp = queue.poll();
                tempList.add(temp.val);
                //从右向左
                if (temp.left != null) {
                    queue.add(temp.left);
                    ++count;
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                    ++count;
                }
            }
            if (reverse % 2 == 0) {
                Collections.reverse(tempList);
            }
            res.add(tempList);
            tempCount = count;
            count = 0;
            ++reverse;
        }
        return res;
    }
}
