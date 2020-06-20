package com.leetcode;

/**
 * 回溯法的思路：
 * 分两种情况：1.有*号的情况；2.无*号的情况
 * 有*号：
 * 可以分为两种情况：
 * 第一种直接忽略*号和前面的模式字符，然后递归
 * 递归过程中返回false，说明直接忽略*号不行，然后回溯，即执行||运算符后面的dfs
 * 如果第一个字符和*号前面的模式字符匹配，则继续执行，此时取目标字符剩余的子串
 *
 * 无*号：
 * 则直接先判断第一个字符是否匹配，不匹配返回false
 * 匹配则继续执行，此时取目标字符剩余的子串
 */
public class Solution10 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        //判断第一个字符是否匹配
        boolean first_match = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            //用到了或运算的 短路 实现回溯
            //如果有*号，首先忽略，然后进行递归，在递归的过程中返回了false，说明直接忽略*号是不行的，进行回溯，执行||后面的语句
            //然后再执行或运算后面的操作，前提是第一个字符和*号前面的字符匹配，如果不匹配则返回false
            return isMatch(s, p.substring(2)) || (first_match && isMatch(s.substring(1), p));
        } else {
            //如果没有*号，如果第一个字符匹配，则继续递归
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
