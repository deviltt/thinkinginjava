package com.剑指offer;

/**
 * 剑指 Offer 18. 删除链表的节点
 * 创建dummyHead保留prev
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        dummyHead.next = head;
        ListNode cur = head;
        while (cur != null) {
            if(cur.val==val){
                p.next=cur.next;
            }else{
                p=cur;
            }
            cur=cur.next;
        }
        return dummyHead.next;
    }
}
