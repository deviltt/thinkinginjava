package com.preparing;

import java.util.Scanner;

public class P5725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        //输出正方形
        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (count < 10) {
                    System.out.printf("0" + count++);
                } else {
                    System.out.printf("" + count++);
                }
            }
            System.out.println();
        }

        count = 1;
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                if (j > i) {
                    System.out.printf("  ");
                } else {
                    if (count < 10) {
                        System.out.printf("0" + count++);
                    } else {
                        System.out.printf("" + count++);
                    }
                }
            }
            System.out.println();
        }
    }
}
