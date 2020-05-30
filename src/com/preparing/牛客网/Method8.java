package com.preparing.牛客网;

import java.util.Scanner;

/**
 * 进制转换
 */
public class Method8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().toUpperCase();

            int sum = 0;

            int length = s.length();
            for (int i = 2; i < length; i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'F') {
                    sum += (s.charAt(i) - 'A' + 10) * Math.pow(16, length - i - 1);
                } else {
                    sum += (s.charAt(i) - '0') * Math.pow(16, length - i - 1);
                }
            }
            System.out.println(sum);
        }
    }
}
