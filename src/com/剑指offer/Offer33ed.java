package com.剑指offer;

import java.util.Stack;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 单调栈解法
 * 主要考虑4个问题
 * 为什么要入栈
 * 什么时候入栈
 * 为什么要出栈
 * 什么时候出栈
 */
public class Offer33ed {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int rootVal = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {

            //当遇到第一个递减节点时，表示要开始遍历左子树了，
            // 找出这个节点的最近根节点，相当于把最近根节点的右枝给剪掉
            while (!stack.isEmpty() && stack.peek() > postorder[i]) {
                rootVal = stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;
    }
}
