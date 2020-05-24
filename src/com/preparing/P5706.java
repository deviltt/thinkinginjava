package com.preparing;

import java.util.Scanner;

public class P5706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int students = scanner.nextInt();

        System.out.printf("%.3f", num / students);
        System.out.println();
        System.out.println(2 * students);
    }
}
