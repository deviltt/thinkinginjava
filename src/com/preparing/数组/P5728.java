package com.preparing.数组;

import java.util.Scanner;

public class P5728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isOpponent(arr, i, j)) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isOpponent(int[][] arr, int i, int j) {
        int tempC1 = arr[i][0];
        int tempM1 = arr[i][1];
        int tempE1 = arr[i][2];
        int tempC2 = arr[j][0];
        int tempM2 = arr[j][1];
        int tempE2 = arr[j][2];
        int sum1 = tempC1 + tempM1 + tempE1;
        int sum2 = tempC2 + tempM2 + tempE2;
        if (Math.abs(tempC1 - tempC2)  <= 5 && Math.abs(tempM1 - tempM2) <= 5 &&  Math.abs(tempE1 - tempE2) <= 5 && Math.abs(sum1 - sum2)  <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
