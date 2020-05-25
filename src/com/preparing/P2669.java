package com.preparing;

import java.util.Scanner;

public class P2669 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        int coins = 0;
        int i = 1;
        for (; K - i > 0; K -= i++) {
            coins += i * i;
        }

        System.out.println(coins + i * K);
    }
}
