package com.leetcode.stack;

import java.util.Stack;

/**
 * 棒球比赛
 * 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
 * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
 */
public class Solution682 {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String s : ops){
            switch (s){
                case "C":
                    sum -= stack.pop();
                    break;
                case "D":
                    sum += stack.peek() * 2;
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int temp = stack.pop();
                    int temp1 = temp + stack.peek();
                    sum += temp1;
                    stack.push(temp);
                    stack.push(temp1);
                    break;
                default:
                    sum += Integer.parseInt(s);
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        return sum;
    }
}
