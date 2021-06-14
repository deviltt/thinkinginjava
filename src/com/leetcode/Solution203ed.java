package com.leetcode;

public class Solution203ed {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        // 递归，优先遍历下面一个元素，然后一个个返回
        head.next = removeElements(head.next, val);


        // 在这里进行回溯
        return head.val == val ? head.next : head;
    }
}
