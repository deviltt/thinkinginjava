package com.leetcode;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1, head);
        ListNode p = dummyHead;
        ListNode q = head;

        while (q != null) {
            if (q.val == val) {
                p.next = q.next;
            } else {
                p = p.next;
            }
            q = q.next;
        }

        return dummyHead.next;
    }
}
