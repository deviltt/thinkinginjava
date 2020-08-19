package com.剑指offer;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 * "4193 with words"
 * O(1)
 */
public class Offer67ed {
    public int strToInt(String str) {
        int i = 0, boundary = Integer.MAX_VALUE / 10, sign = 1, res = 0;
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        while (str.charAt(i) == ' ') {
            ++i;
            if (i == length) {
                return 0;
            }
        }

        if (str.charAt(i) == '-') {
            sign = -1;
        }
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            ++i;
        }

        for (int j = i; j < length; j++) {
            //如果超出 1 ~ 9 字符范围
            if (str.charAt(j) > '9' || str.charAt(j) < '0') {
                break;
            }

            //考虑即将出现越界的情况
            if (res > boundary || (res == boundary && str.charAt(j) > '7')) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            //正常情况
            res = res * 10 + (str.charAt(j) - '0');
        }

        return sign * res;
    }
}
