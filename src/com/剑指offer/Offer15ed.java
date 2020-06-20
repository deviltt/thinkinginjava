package com.剑指offer;

public class Offer15ed {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            ++result;
            n&=(n-1);
        }
        return result;
    }
}
