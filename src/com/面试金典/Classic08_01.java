package com.面试金典;

public class Classic08_01 {
    public int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i < n + 1; i++) {
            // 因为值很大，所以前两个数相加后也要取模
            arr[i] = ((arr[i - 1] + arr[i - 2]) % 1000000007 + arr[i - 3]) % 1000000007;
        }
        return arr[n];
    }
}
