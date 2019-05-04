package com.leetcode;

/**
 * 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 * A = [1, 2, 3, 4]
 * 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
 * 思路：状态转移方程f(n)=f(n-1)+1; 条件是a(n)-a(n-1)=a(n-1)-a(n-2)
 * result = 2dp[i-1] + 1 = result + dp[i];
 */
public class Solution413 {
    public int numberOfArithmeticSlices(int[] A) {
//        int result = 0;
//        int[] dp = new int[A.length];
//        for (int i = 2; i < A.length; i++) {
//            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2])
//                dp[i] = dp[i - 1] + 1;
//            result += dp[i];
//        }
//        return result;
        int result = 0, cur = 0, old = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                cur = old + 1;
                old = cur;
            } else {
                cur = 0;
                old = 0;
            }
            result += cur;
        }
        return result;
    }
}
