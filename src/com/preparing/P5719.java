package com.preparing;

import java.util.Scanner;

public class P5719 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), k = scanner.nextInt();

        double sum1 = 0, num1 = 0, sum2 = 0, num2 = 0;

        for (int i = 1; i <= N; i++) {
            if (i % k == 0) {
                sum1 += i;
                ++num1;
            } else {
                sum2 += i;
                ++num2;
            }
        }
        System.out.printf("%.1f %.1f", sum1 / num1, sum2 / num2);
    }
}
