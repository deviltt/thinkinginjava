package com.leetcode.string;

/**
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * 返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 * 输入：str1 = "ABABAB", str2 = "ABAB"
 * 输出："AB"
 * <p>
 * 思路：首先知道如果满足都能够除尽的话，那么str1+str2==str2+str1
 */
public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        //如果存在，那肯定是两个字符串长度的最大公约数
        int result = gcd(str1.length(), str2.length());
        return str1.substring(0, result);
    }

    /**
     * 最大公约数算法
     *
     * @param l1 除数
     * @param l2 被除数
     * @return
     */
    private int gcd(int l1, int l2) {
        return l2 != 0 ? gcd(l2, l1 % l2) : l1;
    }
}
