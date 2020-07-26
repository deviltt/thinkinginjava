package com.剑指offer;

import java.util.Stack;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 * 算法思路：
 * 每push一个元素的时候，观察poped当前位置的元素和栈顶元素是否相等
 * 如果相等且栈不为空的话就循环pop
 * 最后观察栈是否为空，为空说明满足弹出序列
 */
public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int poppedIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : pushed) {
            stack.push(i);
            while (!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
                stack.pop();
                ++poppedIndex;
            }
        }
        return stack.isEmpty();
    }
}
