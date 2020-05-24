package com.preparing;

import java.util.Scanner;

public class P5720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextInt();
        int num = 0;
        while (N / 2 != 0) {
            N = Math.floor(N / 2);
            ++num;
        }

        System.out.println(num);
    }
}
