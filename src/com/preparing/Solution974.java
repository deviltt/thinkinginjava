package com.preparing;

public class Solution974 {
    public int subarraysDivByK(int[] A, int K) {
        //暴力求解法，会超时
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {

                sum += A[j];

                if (sum % 5 == 0) {
                    ++count;
                }
            }
        }
        return count;
    }
}
