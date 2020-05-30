package com.preparing.牛客网;

import java.util.Scanner;

/**
 * 数字颠倒
 */
public class Method14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        reverseArr(chars);

        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder.toString());
    }

    private static void reverseArr(char[] chars) {
        int i = 0, j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            ++i;
            --j;
        }
    }


}
