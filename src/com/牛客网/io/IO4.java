package com.牛客网.io;

import java.util.Scanner;

public class IO4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            int n=scanner.nextInt();

            if (n==0){
                break;
            }

            int sum=0;

            for (int i = 0; i < n; i++) {
                sum+=scanner.nextInt();
            }

            System.out.println(sum);
        }
    }
}
