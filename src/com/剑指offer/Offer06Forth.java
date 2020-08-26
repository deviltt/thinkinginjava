package com.剑指offer;

/**
 * 反向填充数组
 */
public class Offer06Forth {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int count = 0;
        ListNode node = head;

        while (node != null) {
            node = node.next;
            ++count;
        }

        int[] res = new int[count];

        node = head;
        while (node != null) {
            res[count - 1] = node.val;
            node = node.next;
        }
        return res;
    }
}
