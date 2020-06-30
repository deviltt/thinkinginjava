package com.剑指offer;

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        dummyHead.next = head;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                p.next = cur.next;
                cur.next = null;
            }
            p = cur;
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
