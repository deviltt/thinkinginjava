package com.leetcode.stack;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 思路：遇到左括号就入栈，遇到右括号则与栈顶元素进行匹配，如果匹配成功则出栈，最后判断栈是否为空
 * 两种情况：
 * 1. ']'时栈为空
 * 2. ']'时与栈顶元素不匹配
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty())
                        return false;
                    else if (stack.peek().equals('('))
                        stack.pop();
                    else
                        return false;
                    break;
                case '}':
                    if (stack.empty())
                        return false;
                    else if (stack.peek().equals('{'))
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (stack.empty())
                        return false;
                    else if (stack.peek().equals('['))
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
