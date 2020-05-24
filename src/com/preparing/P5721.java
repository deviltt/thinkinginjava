package com.preparing;

import java.util.Scanner;

public class P5721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int num = 1;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (num < 10) {
                    System.out.print("0" + num);
                } else {
                    System.out.print("" + num);
                }
                ++num;
            }
            System.out.println();
        }
    }
}
