package com.剑指offer;

public class Offer264 {
    public int nthUglyNumber(int n) {
        //先构建丑数数组，用来保存丑数
        int[] arr = new int[n];
        arr[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0, ugly;
        for (int i = 1; i < n; i++) {
            ugly = Math.min(arr[p2] * 2, Math.min(arr[p3] * 3, arr[p5] * 5));
            //三个指针移动的时机
            if (ugly == arr[p2] * 2) {
                ++p2;
            }
            if (ugly == arr[p3] * 3) {
                ++p3;
            }
            if (ugly == arr[p5] * 5) {
                ++p5;
            }
            arr[i] = ugly;
        }
        return arr[n - 1];
    }
}
