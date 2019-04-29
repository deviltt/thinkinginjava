package com.leetcode;

/**
 * 使用isPalindrome二维数组来记录哪一个字符串是回文串
 */
public class Solution647ed {
    public int countSubstrings(String s) {
        int result = 1;
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];
        isPalindrome[0][0] = true;
        //计算长度为1和2的回文
        for (int i = 1; i < s.length(); i++) {
            ++result;
            isPalindrome[i][i] = true;
            if (s.charAt(i) == s.charAt(i - 1)) {
                isPalindrome[i - 1][i] = true;
                ++result;
            }
        }
        //计算长度大于3的回文字符串
        for (int i = 2; i < s.length(); i++) {
            for (int j = i - 2; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) && isPalindrome[j + 1][i - 1]) {
                    ++result;
                    isPalindrome[j][i]=true;
                }
            }
        }
        return result;
    }
}
