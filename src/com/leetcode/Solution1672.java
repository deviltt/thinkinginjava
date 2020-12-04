package com.leetcode;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int[] arr = accounts[i];
            int tempSum = 0;
            for (int j = 0; j < arr.length; j++) {
                tempSum += arr[j];
            }
            sum = Math.max(tempSum, sum);
        }
        return sum;
    }
}
