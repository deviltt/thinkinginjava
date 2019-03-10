package com.leetcode;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class Solution709 {
    public String toLowerCase(String str) {
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] >= 'A' && c[i] <= 'Z'){
                c[i] = (char)(c[i] - 'A' + 'a');
            }
        }
        return String.valueOf(c);
    }
}
