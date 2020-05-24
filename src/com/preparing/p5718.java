package com.preparing;

import java.util.Scanner;

public class p5718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int temp : arr) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}
