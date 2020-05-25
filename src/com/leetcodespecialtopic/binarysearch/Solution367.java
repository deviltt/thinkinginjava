package com.leetcodespecialtopic.binarysearch;

/**
 * 367. 有效的完全平方数
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 输入：16
 * 输出：True
 * <p>
 * 注:不能使用乘积判断，会产生溢出
 */
public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
//            int mul=mid*mid;    //不可以用乘法，会溢出，类似上面求mid的方法
            if (mid > num / mid) {
                right = mid - 1;
            } else if (mid < num / mid) {
                left = mid + 1;
            } else {
                return num / mid == 0;  //这一步条件 mid==num/mid 相等不代表mid*mid=num
            }
        }
        return false;
    }
}
