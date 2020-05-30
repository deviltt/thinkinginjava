package com.preparing.牛客网;

import java.util.Scanner;

public class Method10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double n = scanner.nextDouble();

        String s = String.valueOf(n);

        String[] strings = s.split("\\.");

        int result = Integer.valueOf(strings[0]);

        if (strings[1].charAt(0) - '0' >= 5) {
            System.out.println(result + 1);
        } else {
            System.out.println(result);
        }
    }
}
