package com.preparing.牛客网;

import java.util.Scanner;

public class Method16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;

        while (n / 2 != 0) {
            if (n % 2 == 1) {
                ++count;
            }
            n /= 2;
        }
        if (n % 2 == 1) {
            ++count;
        }
        System.out.println(count);
    }
}
