package com.leetcode.listnode;

public class TailInsertListWithoutHeadNode {
    public static ListNode createList(int n) {
        ListNode head, rear;
        rear = head = null;
        int i = 0;
        while (i <= n) {
            ListNode temp = new ListNode(i++);
            if (head == null) {
                head = temp;
                rear = head;
            } else {
                rear.next = temp;
                rear = temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = createList(5);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
