package com.leetcode;

/**
 * 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 方法1：中心扩展法
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        int start = 0, end = 0;//初始回文子串的索引
        for (int i = 0; i < s.length(); i++) {
            int len1 = subString(s, i, i);
            int len2 = subString(s, i, i + 1);
            int len = Math.max(len1, len2);
            //跟新最长回文子串的索引
            if (len > end - start) {
                start = i - (len - 1) / 2;  //考虑到当回文子串的长度为偶数时的情况
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int subString(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;    //这边是-1
    }
}
