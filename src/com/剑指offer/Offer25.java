package com.剑指offer;

/**
 * 剑指 Offer32_I 25. 合并两个排序的链表
 */
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        if (l2 != null) {
            cur.next = l2;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        return dummyHead.next;
    }
}
