package com.面试金典;

/**
 * 面试题 01.03. URL化
 * 方法1：暴力遍历
 */
public class Classic01_03 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String temp = "   ".trim();
        System.out.println(temp.length());
    }
}
