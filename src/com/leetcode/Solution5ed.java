package com.leetcode;

/***
 * 最长回文子串
 * 动态规划的方法
 */
public class Solution5ed {
    public String longestPalindrome(String s) {
        if (s==null||s.length()==0)
            return "";
        boolean[][] dp = new boolean[s.length()][s.length()]; //0不是回文子串，1是回文子串
        int maxLength = 1;//当前最长回文子串肯定为1
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                //如果i,j相邻或者相等，则直接进行判断
                if (i - j < 2) {
                    dp[j][i] = (s.charAt(j) == s.charAt(i));
                } else {
                    //否则判断首尾字符是否相等，同时去掉首尾字符的子串是否为回文子串
                    dp[j][i] = (dp[j + 1][i - 1] && (s.charAt(j) == s.charAt(i)));
                }
                //如果是回文子串，并且大于当前最大回文子串的值则跟新最大回文子串的值maxLength
                if (dp[j][i] && maxLength < i - j + 1) {
                    maxLength = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start, start+maxLength);
    }
}
