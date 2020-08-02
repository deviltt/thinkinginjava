package com.leetcode;

/**
 * 剑指 Offer 43. 1～n整数中1出现的次数
 */
public class Solution43 {
    public int countDigitOne(int n) {
        //定义5个变量
        int res = 0,            //返回值，默认是0
                digit = 1,      //用于保存
                high = n / 10,  //拐点的左边
                low = 0,        //拐点的右边
                cur = n % 10;   //当前位置的值
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                res += high * digit;
            } else if (cur == 1) {
                res += high * digit + low + 1;
            } else {
                res += (high + 1) * digit;
            }
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}
