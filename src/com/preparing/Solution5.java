package com.preparing;

/**
 * 暴力求解
 */
public class Solution5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        int maxLength = 1;
        int begin = 0;    //用来记录最长回文子串的起始位置
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i + 1 > maxLength && isPalindrome(chars, i, j)) {
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLength);

    }

    private static boolean isPalindrome(char[] chars, int left, int right) {
        boolean flag = true;

        while (left < right) {
            if (chars[left++] != chars[right--]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
