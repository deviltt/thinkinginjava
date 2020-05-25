package com.preparing;

import java.util.Scanner;

public class P1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int count = 0;
        int m = 0, isEnter = 0;    //m用于判断输出0还是1
        while (count < N * N) {
            int temp = scanner.nextInt();
            for (int i = temp; i >= 1; i--) {
                //判断是否需要回车
                if (isEnter == N) {
                    System.out.println();
                    isEnter = 0;
                }
                //判断输出0还是1
                if (m % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                ++isEnter;
                ++count;
            }
            ++m;
        }
    }
}
