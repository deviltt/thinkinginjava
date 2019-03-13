package com.leetcode.listnode;

/**
 * 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        //使用尾插法
        ListNode temp = null;
        ListNode p = null;
        while (head != null) {
            p = head.next;
            head.next = temp;
            temp = head;
            head = p;
        }
        return temp;
    }
}
