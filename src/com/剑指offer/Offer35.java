package com.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 随机链表的复制
 */
public class Offer35 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val, null, null));
            node = node.next;
        }
        node = head;
        while (node != null) {
            Node temp = map.get(node);
            temp.next = map.get(node.next);
            temp.random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
