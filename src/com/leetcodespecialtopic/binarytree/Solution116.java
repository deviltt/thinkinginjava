package com.leetcodespecialtopic.binarytree;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 */
public class Solution116 {
    public Node connect(Node root) {
        dfs(root);
        return root;
    }

    private void dfs(Node root) {
        //因为是完美二叉树，因此只要root.left 或者 root.right一个为null就返回
        if (root.left == null || root.right == null) {
            return;
        }
        root.left.next = root.right;
        if (root.next!=null){
            root.right.next=root.next.left;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
