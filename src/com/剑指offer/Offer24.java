package com.剑指offer;

/**
 * 剑指 Offer32_I 24. 反转链表
 */
public class Offer24 {
    private ListNode dummyHead = new ListNode(-1);

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;

        while (cur != null) {
            head = head.next;
            cur.next = dummyHead.next;
            dummyHead.next = cur;
            cur = head;
        }

        return dummyHead.next;
    }
}
