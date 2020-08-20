package com.剑指offer;

/**
 * 剑指 Offer 44. 数字序列中某一位的数字
 */
public class Offer44 {
    public int findNthDigit(int n) {
        //初始化
        int digit = 1; long count = 9; long start = 1;

        //确定位数digit，起始数start，以及在这个范围内的count数
        while (n > count) {
            n -= count;
            ++digit;
            start *= 10;
            count = 9 * start * digit;
        }

        int temp = (n - 1) % digit;
        long sum = start + (n - 1) / digit;

        return Long.toString(sum).charAt(temp) - '0';
    }
}
