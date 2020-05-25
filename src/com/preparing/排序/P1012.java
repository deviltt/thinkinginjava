package com.preparing.排序;

import java.util.Scanner;

public class P1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i]=scanner.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((str[i] + str[j]).compareTo(str[j] + str[i]) < 0) {
                    String temp;
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(String tempStr:str){
            System.out.print(tempStr);
        }
    }
}
