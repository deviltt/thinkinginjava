package com.luogu.背包问题;

import java.util.Scanner;

public class P1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int m = scanner.nextInt();
        int[] w = new int[m + 1];
        int[] v = new int[m + 1];
        for (int j = 1; j <= m; j++) {
            w[j] = scanner.nextInt();
            v[j] = scanner.nextInt();
        }
        int[][] dp = new int[m + 1][weight + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= weight; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > w[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]*w[i]);
                }
            }
        }
        System.out.println(dp[m][weight]);
    }
}
