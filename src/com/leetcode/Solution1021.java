package com.leetcode;

import java.util.Stack;

/**
 *  输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 删除最外层的括号
 */
public class Solution1021 {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()){
                start = i;
            }
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                end = i;
                stringBuilder.append(S.substring(start + 1, end));
                start = end + 1;
            }
        }
        return stringBuilder.toString();
    }
}
