package com.leetcode;

/**
 * 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */
public class Solution258 {
    public int addDigits(int num) {
        int sum;
        while (num > 9) {
            sum = 0;
            while (num > 0) {
                int temp = num % 10;
                sum += temp;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
