package com.leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 输入: "()"
 * 输出: true
 * 输入: "([)]"
 * 输出: false
 * 思路：利用栈的思想，遍历字符串，将左括号入栈，当遇到右括号时和栈顶元素进行匹配，匹配成功则出栈
 */
public class Solution20 {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c1 : c) {
            if (c1=='('||c1=='['||c1=='{')
                stack.push(c1);
            else {
                if (stack.isEmpty())
                    return false;
                if ((c1==')'&&stack.peek()=='(') ||(c1==']'&&stack.peek()=='[')||(c1=='{'&&stack.peek()=='{'))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
