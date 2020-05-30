package com.preparing.牛客网;

import java.util.Arrays;
import java.util.Scanner;

public class Method15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.valueOf(scanner.nextLine()) ;
        String[] strings=new String[n];
        for (int i = 0; i < n; i++) {
            strings[i]=scanner.nextLine();
        }

        Arrays.sort(strings);

        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }
}
