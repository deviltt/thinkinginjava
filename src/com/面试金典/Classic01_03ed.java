package com.面试金典;

/**
 * 面试题 01.03. URL化
 * 调用java库函数
 */
public class Classic01_03ed {
    public String replaceSpaces(String S, int length) {
        return S.substring(0, length).replace(" ", "%20");
    }
}
