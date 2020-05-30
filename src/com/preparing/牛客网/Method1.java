package com.preparing.牛客网;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            if (n>0){
                System.out.println(deal(n));
            }

        }
    }

    private static int deal(int n) {
        int count = 0;
        while (n >= 3) {
            int a = n / 3;
            int b = n % 3;
            count += a;
            n = a + b;
        }
        if (n==2){
            ++count;
        }
        return count;
    }
}
