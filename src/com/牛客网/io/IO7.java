package com.牛客网.io;

import java.util.Scanner;

public class IO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] strings = scanner.nextLine().split(" ");

            int sum = 0;

            for (int i = 0; i < strings.length; i++) {
                sum += Integer.valueOf(strings[i]);
            }

            System.out.println(sum);
        }
    }
}
