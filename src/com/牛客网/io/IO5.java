package com.牛客网.io;

import java.util.Scanner;

public class IO5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        while (n>0){
            int nums=scanner.nextInt();

            int sum=0;
            for (int i = 0; i < nums; i++) {
                sum +=scanner.nextInt();
            }

            System.out.println(sum);
            --n;
        }
    }
}
