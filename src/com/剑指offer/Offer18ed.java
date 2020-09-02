package com.剑指offer;

/**
 * 剑指 Offer 18. 删除链表的节点(递归法)
 */
public class Offer18ed {
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return null;
        }
        if (head.val==val){
            return head.next;
        }

        head.next=deleteNode(head.next,val);

        return head;
    }
}
