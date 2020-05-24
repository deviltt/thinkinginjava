package com.preparing;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BigInteger的加减乘除
 *
 * add 
 */
public class P1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        BigInteger sum = new BigInteger("0");

        for (int i = 1; i <= N; i++) {
            sum = sum.add(deal(i));
        }

        System.out.println(sum);
    }

    private static BigInteger deal(int i) {
        BigInteger temp = new BigInteger("1");

        for (int j = 2; j <= i; j++) {
            temp = temp.multiply(new BigInteger(Integer.toString(j)));   //把j变成字符串
        }

        return temp;
    }
}
