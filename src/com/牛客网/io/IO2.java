package com.牛客网.io;

import java.util.Scanner;

public class IO2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        while (n>0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();

            System.out.println(a+b);

            --n;
        }
    }
}
