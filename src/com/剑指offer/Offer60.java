package com.剑指offer;

/**
 * 剑指 Offer 60. n个骰子的点数
 * 1.表示状态 dp[i][j] 投掷第i枚骰子，点数和为j的次数
 * 2.状态转移方程
 * 3.边界处理
 */
public class Offer60 {
    public double[] twoSum(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];

        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                //表示第i次投掷可能出现的点数，一定是1-6之间的某一个数
                for (int k = 1; k <= 6; k++) {
                    //==0表示上次投掷为0，显然这种情况不存在
                    if (j - k <= 0) {
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        double all = Math.pow(6, n);
        //因为投掷n枚骰子，可能出现的点数和为 n ~ 6*n，对应的个数为 5n+1
        double[] res = new double[5 * n + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = dp[n][n + i] / all;
        }
        return res;
    }
}
