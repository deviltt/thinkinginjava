package com.牛客网.io;

import java.util.Scanner;

public class IO3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a==0&&b==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
