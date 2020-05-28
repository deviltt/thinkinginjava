package com.牛客网;

import java.util.Scanner;

//求最小公倍数
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        int p = a, q = b;

        while (a % b != 0) {
            int c = a % b;

            a = b;
            b = c;
        }
        //b即为最大公约数

        System.out.println(p * q / b);
    }
}
