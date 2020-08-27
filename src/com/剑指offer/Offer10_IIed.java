package com.剑指offer;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题（数组法）
 */
public class Offer10_IIed {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[101];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            int sum = arr[i - 2] + arr[i - 1];
            arr[i] = sum % 1000000007;
        }
        return arr[n];
    }
}
