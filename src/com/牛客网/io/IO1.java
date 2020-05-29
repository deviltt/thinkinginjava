package com.牛客网.io;

import java.util.Scanner;

public class IO1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();

            System.out.println(a+b);
        }
    }
}
