package com.bytedance;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 思想：使用jdk的startWith()函数判断是否是公共前缀
 */
public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int i = 0;
        boolean bool = true;
        for (i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(strs[0].substring(0, i + 1))) {
                    continue;
                } else {
                    bool = false;
                    break;
                }
            }
            if (!bool)
                break;
        }
        if (bool) {
            return strs[0].substring(0, i);
        } else if(!bool && i == 0) {
            return "";
        }else {
            return strs[0].substring(0, i);
        }
    }

    public static void main(String[] args) {
        String[] strings=new String[]{"flower", "flow", "flow"};
        System.out.println(longestCommonPrefix(strings));
    }
}
