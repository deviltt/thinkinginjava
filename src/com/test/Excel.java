package com.test;

import java.util.Scanner;

public class Excel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        while (num / 26 != 0) {
            int temp = num % 26;
            if (temp == 0) {
                stringBuilder.append('Z');
                flag = true;
            } else {
                stringBuilder.append((char) (temp - 1 + 'A'));
            }
            num = num / 26;
            if (flag) {
                num -= 1;
                flag = false;
            }
        }
        if (num != 0) {
            stringBuilder.append((char) (num - 1 + 'A'));
        }
        System.out.println(stringBuilder.reverse().toString());
    }
}
