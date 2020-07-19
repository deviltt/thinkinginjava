package com.leetcode;

/**
 * 1342. 将数字变成 0 的操作次数
 * 判断一个数是不是奇数 用位运算 更快，奇数的二进制表示法的最后一位一定是1
 * 因此 直接和 1 与运算，结果为 0 表示是偶数 为1表示是 奇数
 * -2 ： 负数的二进制 等于 绝对值 的二进制反码 + 1
 */
public class Solution1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            //位运算
            num = (num & 1) == 1 ? (num & -2) : num >> 1;
//            if (num % 2 != 0) {
//                num -= 1;
//            } else {
//                num /= 2;
//            }
            ++count;
        }
        return count;
    }
}
