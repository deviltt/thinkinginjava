package com.preparing;

import java.util.Scanner;

public class P5732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i][1] = arr[i][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
