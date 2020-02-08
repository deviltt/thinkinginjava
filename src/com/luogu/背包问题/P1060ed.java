package com.luogu.背包问题;

import java.util.Scanner;

public class P1060ed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int weight=scanner.nextInt();   //背包容量
        int numbers=scanner.nextInt();  //物品的个数
        int[] w=new int[numbers+1];
        int[] v=new int[numbers+1];
        for (int i = 1; i <= numbers; i++) {
            w[i]=scanner.nextInt();
            v[i]=scanner.nextInt();
        }
        int[] dp=new int[weight+1];
        for (int i = 1; i <= numbers; i++) {
            for (int j = weight; j >=w[i] ; j--) {
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]*w[i]);
            }
        }
        System.out.println(dp[weight]);
    }
}
