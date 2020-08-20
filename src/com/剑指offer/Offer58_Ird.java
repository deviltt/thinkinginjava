package com.剑指offer;

/**
 * 倒叙遍历
 */
public class Offer58_Ird {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int left = s.length() - 1;
        int right = left;

        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ') {
                --left;
            }
            stringBuilder.append(s.substring(left + 1, right + 1) + " ");
            //跳过空格
            while (left >= 0 && s.charAt(left) == ' ') {
                --left;
            }
            right = left;
        }
        return stringBuilder.toString().trim(); //trim()的目的是去除 最后一个空格
    }
}
