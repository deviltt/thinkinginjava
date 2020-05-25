package com.preparing;

import java.math.BigInteger;
import java.util.Scanner;

public class P1781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        BigInteger[] bigIntegers = new BigInteger[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        for (int i = 0; i < strings.length; i++) {
            bigIntegers[i] = new BigInteger(strings[i]);
        }
        //找到数组中的最大值
        int maxIndex = 0;
        for (int i = 1; i < bigIntegers.length; i++) {
            if (bigIntegers[i].compareTo(bigIntegers[maxIndex]) > 0) {
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + 1);
        System.out.println(bigIntegers[maxIndex]);
    }
}
