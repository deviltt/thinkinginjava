package com.leetcode.listnode;

public class DeleteNthNumber {
    public static void main(String[] args) {
        ListNode head = createList(5);
        ListNode p = head;
        //删除第三个节点
        deleteNode(head, 3);
        while (p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

    private static void deleteNode(ListNode head, int pos) {
        //删除节点的关键是要记录待删除节点的前一个节点
        ListNode post = head.next;
        for (int i = 1; i < pos - 1; i++){
            head = post;
            post = head.next;
        }
        head.next = post.next;
    }

    private static ListNode createList(int n){
        int i = 0;
        ListNode head = null;
        for (;i < n; i++){
            ListNode temp = new ListNode(i);
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
