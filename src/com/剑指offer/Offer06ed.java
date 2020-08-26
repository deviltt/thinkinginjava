package com.剑指offer;

/**
 * 建立反向链表
 */
public class Offer06ed {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
//        List<Integer> list = new ArrayList<>();
        ListNode prev = null, cur = head, temp = null;
        int count = 0;

        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            ++count;
        }

        int[] res = new int[count];
        count = 0;

        head = prev;
        while (head != null) {
//            list.add(head.val);
            res[count++] = head.val;
            head = head.next;
        }

//        return list.stream().mapToInt(Integer::valueOf).toArray();
        return res;
    }
}
