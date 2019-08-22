package com.leetcode.greedy;

import java.util.Stack;

/**
 * 当栈为空时，遇到右括号，结果result就加1，
 * 最终的结果是result+栈的深度
 */
public class Solution921 {
    public int minAddToMakeValid(String S) {
//        int result = 0;
//        Stack<Character> stack = new Stack<>();
//        for (char c : S.toCharArray()) {
//            if (c == ')' && stack.isEmpty()) {
//                ++result;
//            } else if (c == ')') {
//                stack.pop();
//            }
//            if (c == '(') {
//                stack.push(c);
//            }
//        }
//        return result + stack.size();
        int left = 0, right = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                ++left;
            }
            if (c == ')' && left > 0) {
                --left;
            } else {
                ++right;
            }
        }
        return left + right;
    }
}
