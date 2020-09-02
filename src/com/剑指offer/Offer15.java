package com.剑指offer;

public class Offer15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;    //无论正负数，右移后高位都补0
        }
        return count;
    }
}
