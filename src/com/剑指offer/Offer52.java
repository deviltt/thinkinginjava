package com.剑指offer;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * 双指针法
 */
public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA, node2 = headB;

        while (node1 != node2) {
            node1 = node1 != null ? node1.next : headB;
            node2 = node2 != null ? node2.next : headA;
        }
        return node1;
    }
}
