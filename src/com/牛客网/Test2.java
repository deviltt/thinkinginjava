package com.牛客网;

import java.util.Scanner;

//高精度整数加法，带符号
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder result = new StringBuilder();
        add(chars1, chars2, result);
        System.out.println(result.reverse().toString());

    }

    private static void add(char[] a, char[] b, StringBuilder result) {
        int al = a.length - 1, bl = b.length - 1;

        int carry = 0;
        while (al >= 0 && bl >= 0) {
            int temp1 = a[al] - '0';
            int temp2 = b[bl] - '0';

            int sum = temp1 + temp2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            --al;
            --bl;
        }
        while (al >= 0) {
            int sum = (a[al]-'0') + carry;
            result.append(sum % 10);
            carry = sum / 10;
            --al;
        }
        while (bl>=0){
            int sum = (b[bl]-'0') + carry;
            result.append(sum % 10);
            carry = sum / 10;
            --bl;
        }
        if (carry>0){
            result.append(carry);
        }
    }
}
