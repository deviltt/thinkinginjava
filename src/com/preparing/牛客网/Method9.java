package com.preparing.牛客网;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Method9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        List<Long> list = new LinkedList<>();
        //找出n所有的质数，存到list中
        findPrime(list, n);

        for (int i = 0; i < list.size(); i++) {
            long temp = list.get(i);
            while (n % temp == 0) {
                System.out.print(temp + " ");
                n /= temp;
                if (isPrime(n)) {
                    break;
                }
            }
            if (isPrime(n)) {
                System.out.print(n);
                break;
            }
        }
    }

    private static void findPrime(List<Long> list, long n) {
        for (long i = 2; i < n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
    }

    private static boolean isPrime(long i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }


}
