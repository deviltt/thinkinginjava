package com.剑指offer;

/**
 * 剑指 Offer 36. 二叉搜索树与双向链表
 */
public class Offer36 {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;

    private Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        //第一次的时候pre还是null，这个时候的root应该就是head节点，因此使得 head = root
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;
        dfs(root.right);
    }
}
