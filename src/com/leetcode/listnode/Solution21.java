package com.leetcode.listnode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //创建头结点
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                p.next = l2;
                p = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                p = l1;
                l1 = l1.next;
            }
        }
        if (l1 == null)
            p.next = l2;
        if (l2 == null)
            p.next = l1;
        return head.next;
    }
}
