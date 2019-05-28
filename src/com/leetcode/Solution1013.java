package com.leetcode;

/**
 * 暴力法:可以解决问题，但是当测试用例非常大时会超时错误
 */
public class Solution1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sumA = 0, sumB = 0, sumC = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int p = 0; p <= i; p++) {
                    sumA += A[p];
                }
                for (int p = i + 1; p <= j; p++) {
                    sumB += A[p];
                }
                for (int p = j + 1; p < A.length; p++) {
                    sumC += A[p];
                }
                if (sumA == sumB && sumB == sumC)
                    return true;
                sumA = 0;
                sumB = 0;
                sumC = 0;
            }
        }
        return false;
    }
}
