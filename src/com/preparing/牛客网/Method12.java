package com.preparing.牛客网;

import java.util.Scanner;

public class Method12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int i = s.length() - 1;

        while (s.charAt(i)==0){
            --i;
        }

        boolean[] arr=new boolean[10];
        StringBuilder stringBuilder=new StringBuilder();

        for (int j = i; j >=0 ; j--) {
            int temp=s.charAt(j)-'0';
            if (!arr[temp]){
                stringBuilder.append(temp);
                arr[temp]=true;
            }
        }
        System.out.print(Integer.valueOf(stringBuilder.toString()));
    }
}
