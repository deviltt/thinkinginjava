package com.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 */
public class Offer35 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        //1.把每一个节点本身当做key，拷贝节点当做value
        while (node != null) {
            map.put(node, new Node(node.val, null, null));
            node = node.next;
        }
        node = head;
        //此时拷贝节点的next和random都是null，因此要为它们赋值
        while (node != null) {
            Node temp = map.get(node);
            temp.next = map.get(node.next);
            temp.random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
