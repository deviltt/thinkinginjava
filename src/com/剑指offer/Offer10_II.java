package com.剑指offer;

public class Offer10_II {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int p = 0, q = 1, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = 0;
            r += (p + q);
            r %= 1000000007;
        }
        return r;
    }
}
