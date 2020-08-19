package com.剑指offer;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 * "4193 with words"
 * O(n)
 */
public class Offer67 {
    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        if (chars.length==0){
            return 0;
        }
        int sign = 1, //符号位
                i = 1,  //i表示从第几位开始
                res = 0,    //保存结果
                boundary = Integer.MAX_VALUE / 10;

        if (chars[0] == '-') {
            sign = -1;
        } else if (chars[0] != '+') {
            i = 0;
        }

        for (int j = i; j < chars.length; j++) {
            if (chars[j] < '0' || chars[j] > '9') {
                break;
            }

            //判断溢出
            if (res > boundary || (res == boundary && chars[j] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + (chars[j] - '0');
        }


        return sign * res;
    }
}
