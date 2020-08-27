package com.剑指offer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列（优化的方法）
 * 和官方题解相比，这个方法移动元素的次数大大降低
 */
public class Offer09ed {
    private Stack<Integer> stack1;  //负责入列操作
    private Stack<Integer> stack2;  //负责出列操作

    public Offer09ed() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        if (stack1.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
