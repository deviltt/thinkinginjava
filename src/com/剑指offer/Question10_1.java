package com.剑指offer;

public class Question10_1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //因为f0=0, f1=1，所以从2开始遍历，且开始滚动区间
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = 0;
            r += q;
            r += p;
            r %= 1000000007;
        }
        return r;
    }
}
