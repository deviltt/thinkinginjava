package com.剑指offer;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * 不使用库函数，直接写
 */
public class Offer58_Ied {
    public String reverseWords(String s) {
        //去除两端的空白和单词间的空白
        StringBuilder stringBuilder = trimSpace(s);

        //反转字符串
        reverseStr(stringBuilder, 0, stringBuilder.length() - 1);

        reverseEachWord(stringBuilder);
        return stringBuilder.toString();
    }

    private void reverseEachWord(StringBuilder stringBuilder) {
        int length = stringBuilder.length();
        int left = 0, right = 0;
        while (left < length) {
            while (right < length && stringBuilder.charAt(right) != ' ') {
                ++right;
            }
            reverseStr(stringBuilder, left, right - 1);
            ++right;
            left = right;
        }
    }

    private void reverseStr(StringBuilder stringBuilder, int left, int right) {
        while (left < right) {
            char temp = stringBuilder.charAt(left);
            stringBuilder.setCharAt(left++, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right--, temp);
        }
    }

    private StringBuilder trimSpace(String s) {
        int left = 0, right = s.length() - 1;
        //去除两端的空白
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        //去除单词间的空白
        StringBuilder stringBuilder = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);
            if (c != ' ') {
                stringBuilder.append(c);
            } else if (stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
                stringBuilder.append(c);
            }
            ++left;
        }
        return stringBuilder;
    }
}
