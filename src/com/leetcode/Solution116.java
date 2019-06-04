package com.leetcode;

/**
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class Solution116 {
    public Node connect(Node root) {
        dfs(root);
        return root;
    }

    private void dfs(Node root) {
        if (root == null || root.left == null)
            return;
        root.left.next = root.right;
        if (root.next != null)
            root.right.next = root.next.left;
        dfs(root.left);
        dfs(root.right);
    }
}
