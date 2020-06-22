package com.剑指offer;

import java.util.Arrays;

/**
 * 58.左旋转字符串
 */
public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();

        reverseStr(chars, 0, n - 1);
        reverseStr(chars, n, s.length() - 1);
        reverseStr(chars, 0, s.length()-1);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    private void reverseStr(char[] chars, int left, int right) {
        char temp;
        while (left < right) {
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            ++left;
            --right;
        }
    }
}
