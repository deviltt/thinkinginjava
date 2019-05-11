package com.leetcode;

import java.util.Stack;

/**
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        if (tokens.length==1)
            return Integer.parseInt(tokens[0]);
        //遇到数字就入栈
        Stack<String> stack = new Stack<>();
        int answer = 0;
        for (String string : tokens) {
            //如果遇到的是运算符，则出栈，用第二个数操作第一个数
            if (!stack.isEmpty() && string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if (string.equals("+")) {
                    answer = a + b;
                } else if (string.equals("-")) {
                    answer = a - b;
                } else if (string.equals("*")) {
                    answer = a * b;
                } else {
                    answer = a / b;
                }
                stack.push(String.valueOf(answer));
            } else {
                stack.push(string);
            }
        }
        return answer;
    }
}
