package com.leetcode;

/**
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 */
public class Solution647 {
    public int countSubstrings(String s) {
        //中心扩展法
        int result = 1;
        if (s.length() == 0)
            return 0;
        for (int i = 1; i < s.length(); i++) {
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
                ++result;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
                ++result;
            }
        }
        return result;
    }
}
