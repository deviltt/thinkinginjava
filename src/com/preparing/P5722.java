package com.preparing;

import java.util.Scanner;

public class P5722 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt(), sum=0;

        for (int i = 1; i <= N; i++) {
            sum+=i;
        }

        System.out.println(sum);
    }
}
