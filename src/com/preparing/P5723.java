package com.preparing;

import java.util.Scanner;

public class P5723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();

        int sum = 0;  //计算已经装的质数的和
        int count = 0;
        for (int i = 2; i <= L; i++) {
            if (isPrime(i)) {
                int tempSum = sum + i;
                if (tempSum <= L) {
                    ++count;
                    sum = tempSum;
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
