package com.preparing;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;

            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
