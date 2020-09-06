package com.剑指offer;

public class Offer16rd {
    public double myPow(double x, int n) {
        return n <= 0 ? dfsToWhile(x, n) : 1 / dfsToWhile(x, -n);
    }

    private double dfsToWhile(double x, int n) {
        double result = 1.0;
        double temp = x;
        while (n != 0) {
            if (n % 2 != 0) {
                result *= temp;
            }
            temp *= temp;
            n /= 2;
        }
        return result;
    }
}
