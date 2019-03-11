package com.leetcode;

/**
 * 示例 1：
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 */
public class Solution344 {
    public void reverseString(char[] s) {
        int j = s.length;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[--j];
            s[j] = temp;
        }
    }
}
