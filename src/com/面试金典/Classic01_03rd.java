package com.面试金典;

/**
 * 面试题 01.03. URL化
 * char数组替换(效率最高的方式)
 */
public class Classic01_03rd {
    public String replaceSpaces(String S, int length) {
        char[] chars = new char[length * 3];
        int j = 0;
        for (int i = 0; i < length; i++) {
            char temp = S.charAt(i);
            if (temp == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = temp;
            }
        }
        return new String(chars, 0, j); //左闭右开 0-12 那么count=13
    }
}
