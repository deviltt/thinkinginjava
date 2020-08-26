package com.剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归法
 */
public class Offer06rd {
    List<Integer> list = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        dfs(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void dfs(ListNode node) {
        if (node == null) {
            return;
        }
        dfs(node.next);
        //回溯
        list.add(node.val);
    }
}
