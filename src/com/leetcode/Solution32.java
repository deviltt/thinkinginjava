package com.leetcode;

/**
 * 32. 最长有效括号
 * 正逆遍历数组法
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxLength = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                ++left;
            } else {
                ++right;
            }
            if (right > left) {
                left = 0;
                right = 0;
            }else if (right==left){
                maxLength = Math.max(maxLength, 2 * right);
            }
        }
        left=0;
        right=0;
        for (int i = chars.length-1; i >=0; i--) {
            if (chars[i] == '(') {
                ++left;
            } else {
                ++right;
            }
            if (left > right) {
                left = 0;
                right = 0;
            }else if (right==left){
                maxLength = Math.max(maxLength, 2 * right);
            }
        }
        return maxLength;
    }
}
