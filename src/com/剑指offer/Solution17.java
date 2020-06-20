package com.剑指offer;

public class Solution17 {
    public int[] printNumbers(int n) {
        double length = Math.pow(10, n) - 1;
        int[] result = new int[(int) length];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
