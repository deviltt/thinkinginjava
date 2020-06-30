package com.剑指offer;

/**
 * 剑指 Offer32_I 22. 链表中倒数第k个节点
 * 双指针法
 */
public class Offer22ed {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head, next = head;

        while (k > 1) {
            next = next.next;
            --k;
        }

        while (next.next != null) {
            cur = cur.next;
            next = next.next;
        }

        return cur;
    }
}
