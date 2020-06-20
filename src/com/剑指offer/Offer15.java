package com.剑指offer;

public class Offer15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                ++result;
            }
            mask <<= 1;
        }
        return result;
    }
}
