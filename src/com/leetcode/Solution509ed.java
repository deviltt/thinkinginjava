package com.leetcode;

public class Solution509ed {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= N; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}
