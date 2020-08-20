package com.剑指offer;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * 逻辑是对的，但是会超时
 * 时间复杂度分析：每m个数删除一个，一共有n个数
 * 因此时间复杂度 是 O(mn)
 * 超时错误
 */
public class Offer62 {
    public int lastRemaining(int n, int m) {
        //构建循环链表
        ListNode dummyHead = new ListNode(-1);
        ListNode cur, head;
        head = dummyHead;
        for (int i = 0; i < n; i++) {
            cur = new ListNode(i);
            head.next = cur;
            head = head.next;
            if (i == n - 1) {
                head.next = dummyHead.next; //链表首尾相连
            }
        }
        int i = 1, temp = m == 1 ? m : m - 1;
        if (m == 1) {
            cur = dummyHead.next;
        } else {
            head = dummyHead.next;
            cur = head.next;
        }

        while (cur != head) {
            if (i % temp != 0) {
                head = cur;
                cur = cur.next;
                ++i;
            } else {
                head.next = cur.next;
                if (m==1){
                    cur=cur.next;
                }else{
                    head = cur.next;
                    cur = head.next;
                    i = 1;
                }
            }
        }

        return head.val;
    }
}
