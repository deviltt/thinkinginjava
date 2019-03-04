package com.leetcode.stack;

import java.util.Stack;

/**
 * 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：
 * () 得 1 分。
 * AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 * (A) 得 2 * A 分，其中 A 是平衡括号字符串。
 */
public class solution856 {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        for (char c : S.toCharArray()){
            if (c == '('){
                stack.push(-1);
            }else {
                //每一次都要计算一下分数
                int score = 0;
                //遍历知道栈顶元素不为-1
                while (stack.peek() != -1){
                    score += stack.pop();
                }
                stack.pop();
                if (score == 0){
                    stack.push(1);
                }else {
                    stack.push(score * 2);
                }
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()){
            totalScore += stack.pop();
        }
        return totalScore;
    }
}
