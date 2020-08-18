package com.剑指offer;

import java.math.BigInteger;

public class Offer14_II {
    public static int cuttingRope(int n) {
        if (n < 2) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        BigInteger[] dp = new BigInteger[n + 1];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");
        for (int i = 3; i < n + 1; i++) {
            dp[i] = new BigInteger("0");
            for (int j = 1; j <= i / 2; j++) {
                BigInteger tempJ = new BigInteger(j + "");
                BigInteger temp = new BigInteger(i - j + "");
                dp[i] = dp[i].max(tempJ.multiply(temp).max(tempJ.multiply(dp[i - j])));
            }
        }
        return dp[n].mod(new BigInteger("1000000007")).intValue();
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(120));
    }
}
