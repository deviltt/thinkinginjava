package com.剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer32_I 22. 链表中倒数第k个节点
 * 用list来保存遍历的元素
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        return list.get(list.size()-k);
    }
}
