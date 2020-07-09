package com.luogu.背包问题;

import java.util.Scanner;

public class P1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();
        int nums = scanner.nextInt();

        int[] w = new int[nums+1];
        int[] v = new int[nums+1];
        for (int i = 1; i <= nums; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        //第i个物品，当前重量为j时的最大价值
        int[][] dp = new int[nums + 1][weight + 1];
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= weight; j++) {
                if (j > w[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i] * w[i]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[nums][weight]);
    }
}
