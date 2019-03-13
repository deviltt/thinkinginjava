package com.leetcode.listnode;

/**
 * 带头结点的尾插法创建链表
 */
public class TailInsertListWithHeadNode {
    public static void main(String[] args) {
        ListNode head = createList(5);
        ListNode temp = head.next;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode head = new ListNode(-1);
        ListNode rear = head;
        int i = 0;
        while (i <= n) {
            ListNode temp = new ListNode(i++);
            rear.next = temp;
            rear = temp;
        }
        return head;
    }
}
