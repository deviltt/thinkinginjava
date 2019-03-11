package com.leetcode;

/**
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。
 * 如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * 示例:
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 */
public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        //每次都截取2k个字符串，其中只有最后几个字符串有区别
        for (int start = 0; start < chars.length; start += 2 * k){
            int i = start;
            int j = Math.min(i + k - 1, chars.length - 1);
            while (i < j){
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }
        return String.valueOf(chars);
    }
}
