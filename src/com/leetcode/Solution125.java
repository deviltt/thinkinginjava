package com.leetcode;

/**
 * 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null)
            return true;
        //遍历字符串，将字母与数字进行拼接
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                stringBuilder.append(c);
        }
        String temp = stringBuilder.toString();
        //忽略大小写比较字符串相等
        return temp.equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}
