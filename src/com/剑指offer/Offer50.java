package com.剑指offer;

public class Offer50 {
    public double myPow(double x, int n) {
        boolean flag = n < 0;
        int tempN = Math.abs(n);
        double multiple = 1;
        for (int i = 0; i < tempN; i++) {
            multiple *= x;
        }
        if (flag) {
            return 1 / multiple;
        }
        return multiple;
    }
}
