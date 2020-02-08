package com.luogu.背包问题;

import java.util.Scanner;

public class P1164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int weight = scanner.nextInt();
        int[] w = new int[numbers + 1];
        for (int i = 1; i <= numbers; i++) {
            w[i] = scanner.nextInt();
        }
        int[][] dp = new int[numbers + 1][weight + 1];
        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= weight; j++) {
                if (j == w[i]) {
                    dp[i][j] = dp[i - 1][j] + 1;
                } else if (j > w[i]) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - w[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[numbers][weight]);
    }
}
